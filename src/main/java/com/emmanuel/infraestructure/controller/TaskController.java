package com.emmanuel.infraestructure.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emmanuel.application.service.TaskService;
import com.emmanuel.domain.models.Task;
import com.emmanuel.domain.models.TaskDetails;

@RestController
@RequestMapping(path="/api/task")
public class TaskController {

	@Autowired
	public TaskService taskService;
	
	@GetMapping(path="/getOne/{idTask}")
	public ResponseEntity<Task> getOneTask(@PathVariable Integer idTask){
		return taskService.getTask(idTask).map(task -> new ResponseEntity<>(task, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping(path="/getAll")
	public ResponseEntity<List<Task>> getAll(){
		List<Task> tasks = taskService.getAllTasks();
		return new ResponseEntity<>(tasks, HttpStatus.OK);
	}
	
	@GetMapping(path="/getTaskDetails{idTask}")
	public ResponseEntity<TaskDetails> getTaskDetails(@PathVariable Integer idTask){
		TaskDetails taskDetails = taskService.getTaskDetails(idTask);
		return new ResponseEntity<>(taskDetails, HttpStatus.OK);
	}
	
	@PostMapping(path="/createOne")
	public ResponseEntity<Task> createOneTask(@RequestBody Task task){
		Task taskCreated = taskService.createTask(task);
		return new ResponseEntity<>(taskCreated, HttpStatus.CREATED);
	}
	
	@PutMapping(path="/updateOne/{idTask}")
	public ResponseEntity<Task> updateOne(@RequestBody Task taskModel, @PathVariable Integer idTask){
		return taskService.UpdateTask(idTask, taskModel).map(task -> new ResponseEntity<>(task, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.OK));
	}
	
	@DeleteMapping(path="/deleteOne/{idTask}")
	public ResponseEntity<Boolean> deleteOne(@PathVariable Integer idTask){
		Boolean deleted = taskService.deleteTask(idTask);
		if (deleted) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}
	
}
