package com.emmanuel.infraestructure.adapter;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.emmanuel.domain.models.TaskDetails;
import com.emmanuel.domain.ports.out.ExternalServicePort;

@Component
public class ExternalServiceAdapter implements ExternalServicePort{

	private RestTemplate restTemplate = new RestTemplate();
	
	@Override
	public TaskDetails getTaskDetails(Integer idTask) {
		
		String apiUrlTodo = "https://jsonplaceholder.typicode.com/todos/" + idTask;
		
		ResponseEntity<JsonPlaceHolderTodo> responseEntityTodo = restTemplate.getForEntity(apiUrlTodo, JsonPlaceHolderTodo.class);
		JsonPlaceHolderTodo responseTodo = responseEntityTodo.getBody();
		
		if (responseTodo == null) return null;
		
		String apiUrlUser = "https://jsonplaceholder.typicode.com/users/" + responseTodo.getUserId();
		
		ResponseEntity<JsonPlaceHolderUser> responseEntityUser = restTemplate.getForEntity(apiUrlUser, JsonPlaceHolderUser.class);
		JsonPlaceHolderUser responseUser = responseEntityUser.getBody();
		
		if (responseUser == null) return null;
		
		return new TaskDetails(responseUser.getId(), responseUser.getName(), responseUser.getEmail());
	}

	private static class JsonPlaceHolderTodo{
		
		private Integer id;
		
		private Integer userId;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}
	}
	
	private static class JsonPlaceHolderUser{
		
		private Integer id;
		
		private String name;
		
		private String email;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}
	
}
