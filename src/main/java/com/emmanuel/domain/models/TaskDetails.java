package com.emmanuel.domain.models;

public class TaskDetails {

	private final Long userId;
	
	private final String username;

	private final String userEmail;

	public TaskDetails(Long userId, String username, String userEmail) {
		super();
		this.userId = userId;
		this.username = username;
		this.userEmail = userEmail;
	}

	public Long getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public String getUserEmail() {
		return userEmail;
	}
	
}
