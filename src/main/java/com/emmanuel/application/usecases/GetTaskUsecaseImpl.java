package com.emmanuel.application.usecases;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emmanuel.domain.models.Task;
import com.emmanuel.domain.ports.in.GetTaskUsecase;
import com.emmanuel.domain.ports.out.TaskRepositoryPort;

@Service
public class GetTaskUsecaseImpl implements GetTaskUsecase{

	@Autowired
	private TaskRepositoryPort taskRepositoryPort;
	
	@Override
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return taskRepositoryPort.findAll();
	}

	@Override
	public Optional<Task> getTask(Integer idTask) {
		// TODO Auto-generated method stub
		return taskRepositoryPort.findById(idTask);
	}

}
