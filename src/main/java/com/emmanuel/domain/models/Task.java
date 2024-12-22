package com.emmanuel.domain.models;

import java.time.LocalDateTime;

public class Task {

	private Long idTaks;
	
	private String taskTitle;
	
	private String taskDescription;
	
	private LocalDateTime createdDate;
	
	private boolean isCompleted;

	public Task(Long idTaks, String taskTitle, String taskDescription, LocalDateTime createdDate,
			boolean isCompleted) {
		super();
		this.idTaks = idTaks;
		this.taskTitle = taskTitle;
		this.taskDescription = taskDescription;
		this.createdDate = createdDate;
		this.isCompleted = isCompleted;
	}

	public Long getIdTaks() {
		return idTaks;
	}

	public void setIdTaks(Long idTaks) {
		this.idTaks = idTaks;
	}

	public String getTaskTitle() {
		return taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
}
