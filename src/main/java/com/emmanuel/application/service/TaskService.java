package com.emmanuel.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emmanuel.domain.models.Task;
import com.emmanuel.domain.models.TaskDetails;
import com.emmanuel.domain.ports.in.CreateTaskUsecase;
import com.emmanuel.domain.ports.in.DeleteTaskUsecase;
import com.emmanuel.domain.ports.in.GetDetailsUsecase;
import com.emmanuel.domain.ports.in.GetTaskUsecase;
import com.emmanuel.domain.ports.in.UpdateTaskUsecase;

@Service
public class TaskService implements CreateTaskUsecase, DeleteTaskUsecase, GetDetailsUsecase, GetTaskUsecase, UpdateTaskUsecase{

	@Autowired
	private CreateTaskUsecase createTaskUsecase;
	
	@Autowired
	private DeleteTaskUsecase deleteTaskUsecase;
	
	@Autowired
	private GetDetailsUsecase getDetailsUsecase;
	
	@Autowired
	private GetTaskUsecase getTaskUsecase;
	
	@Autowired
	private UpdateTaskUsecase updateTaskUsecase;
	
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
	public TaskDetails getTaskDetails(Integer idTask) {
		return this.getDetailsUsecase.getTaskDetails(idTask);
	}

	@Override
	public Boolean deleteTask(Integer idTask) {
		return this.deleteTaskUsecase.deleteTask(idTask);
	}

	@Override
	public Task createTask(Task task) {
		return this.createTaskUsecase.createTask(task);
	}

}
