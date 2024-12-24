package com.emmanuel.domain.models;

public class TaskDetails {

	private final Integer userId;
	
	private final String username;

	private final String userEmail;

	public TaskDetails(Integer userId, String username, String userEmail) {
		super();
		this.userId = userId;
		this.username = username;
		this.userEmail = userEmail;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public String getUserEmail() {
		return userEmail;
	}
	
}
