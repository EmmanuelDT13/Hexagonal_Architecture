package com.emmanuel.application.service;

import java.util.List;
import java.util.Optional;

import com.emmanuel.domain.models.Task;
import com.emmanuel.domain.models.TaskDetails;
import com.emmanuel.domain.ports.in.CreateTaskUsecase;
import com.emmanuel.domain.ports.in.DeleteTaskUsecase;
import com.emmanuel.domain.ports.in.GetDetailsUsecase;
import com.emmanuel.domain.ports.in.GetTaskUsecase;
import com.emmanuel.domain.ports.in.UpdateTaskUsecase;

public class TaskService implements CreateTaskUsecase, DeleteTaskUsecase, GetDetailsUsecase, GetTaskUsecase, UpdateTaskUsecase{

	private final CreateTaskUsecase createTaskUsecase;
	
	private final DeleteTaskUsecase deleteTaskUsecase;
	
	private final GetDetailsUsecase getDetailsUsecase;
	
	private final GetTaskUsecase getTaskUsecase;
	
	private final UpdateTaskUsecase updateTaskUsecase;
	
	public TaskService(CreateTaskUsecase createTaskUsecase, DeleteTaskUsecase deleteTaskUsecase,
			GetDetailsUsecase getDetailsUsecase, GetTaskUsecase getTaskUsecase, UpdateTaskUsecase updateTaskUsecase) {
		super();
		this.createTaskUsecase = createTaskUsecase;
		this.deleteTaskUsecase = deleteTaskUsecase;
		this.getDetailsUsecase = getDetailsUsecase;
		this.getTaskUsecase = getTaskUsecase;
		this.updateTaskUsecase = updateTaskUsecase;
	}

	@Override
	public Optional<Task> UpdateTask(Integer idTask, Task task) {
		return this.updateTaskUsecase.UpdateTask(idTask, task);
	}

	@Override
	public List<Task> getAllTasks() {
		return this.getTaskUsecase.getAllTasks();
	}

	@Override
	public Optional<Task> getTask(Integer idTask) {
		return this.getTaskUsecase.getTask(idTask);
	}

	@Override
	public Optional<TaskDetails> getTaskDetails(Integer idTask) {
		return this.getDetailsUsecase.getTaskDetails(idTask);
	}

	@Override
	public void deleteTask(Integer idTask) {
		this.deleteTaskUsecase.deleteTask(idTask);
	}

	@Override
	public Task createTask(Task task) {
		return this.createTaskUsecase.createTask(task);
	}

}
