package com.emmanuel.application.usecases;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emmanuel.domain.models.Task;
import com.emmanuel.domain.ports.in.UpdateTaskUsecase;
import com.emmanuel.domain.ports.out.TaskRepositoryPort;

@Service
public class UpdateTaskUsecaseImpl implements UpdateTaskUsecase{

	@Autowired
	private TaskRepositoryPort taskRepositoryPort;
	
	@Override
	public Optional<Task> UpdateTask(Integer idTask, Task task) {
		
		Task taskModel = taskRepositoryPort.findById(idTask).get();

		taskModel.setCompleted(task.isCompleted());
		taskModel.setCreatedDate(task.getCreatedDate());
		taskModel.setTaskDescription(task.getTaskDescription());
		taskModel.setTaskTitle(task.getTaskTitle());
		
		return Optional.of(taskRepositoryPort.save(taskModel));
	}

}
