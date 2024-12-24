package com.emmanuel.infraestructure.entitie;

import java.time.LocalDateTime;

import com.emmanuel.domain.models.Task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaskEntity {

	@Id
	@Column(name="idTask")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTask;
	
	@Column(name="taskTitle")
	private String taskTitle;
	
	@Column(name="taskDescription")
	private String taskDescription;
	
	@Column(name="createdDate")
	private LocalDateTime createdDate;
	
	@Column(name="completed")
	private boolean isCompleted;

	public TaskEntity() {
		super();
	}

	public TaskEntity(Integer idTask, String taskTitle, String taskDescription, LocalDateTime createdDate,
			boolean isCompleted) {
		super();
		this.idTask = idTask;
		this.taskTitle = taskTitle;
		this.taskDescription = taskDescription;
		this.createdDate = createdDate;
		this.isCompleted = isCompleted;
	}
	
	public static TaskEntity fromModel(Task task) {
		return new TaskEntity(task.getIdTaks(), task.getTaskTitle(), task.getTaskDescription(), task.getCreatedDate(), task.isCompleted());
	}

	public Task toDomainModel() {
		return new Task(this.getIdTaks(), this.getTaskTitle(), this.getTaskDescription(), this.getCreatedDate(), this.isCompleted());
	}
	
	public Integer getIdTaks() {
		return idTask;
	}

	public void setIdTaks(Integer idTaks) {
		this.idTask = idTaks;
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
