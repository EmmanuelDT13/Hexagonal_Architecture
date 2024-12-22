package com.emmanuel.application.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emmanuel.domain.models.Task;
import com.emmanuel.domain.ports.in.CreateTaskUsecase;
import com.emmanuel.domain.ports.out.TaskRepositoryPort;

@Service
public class CreateTaskUsecaseImpl implements CreateTaskUsecase{

	@Autowired
	private TaskRepositoryPort taskRepositoryPort;
	
	@Override
	public Task createTask(Task task) {
		return taskRepositoryPort.save(task);
	}

}
