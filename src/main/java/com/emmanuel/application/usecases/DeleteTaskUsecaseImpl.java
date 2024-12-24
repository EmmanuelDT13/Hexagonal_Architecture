package com.emmanuel.application.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emmanuel.domain.ports.in.DeleteTaskUsecase;
import com.emmanuel.domain.ports.out.TaskRepositoryPort;

@Service
public class DeleteTaskUsecaseImpl implements DeleteTaskUsecase{

	@Autowired
	private TaskRepositoryPort taskRepositoryPort;
	
	@Override
	public Boolean deleteTask(Integer idTask) {
		return taskRepositoryPort.deleteById(idTask);
	}

}
