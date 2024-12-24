package com.emmanuel.infraestructure.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emmanuel.domain.models.Task;
import com.emmanuel.domain.ports.out.TaskRepositoryPort;
import com.emmanuel.infraestructure.entitie.TaskEntity;

@Component
public class TaskRepositoryAdapter implements TaskRepositoryPort{

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public Task save(Task task) {
		TaskEntity taskEntity = TaskEntity.fromModel(task);
		Task taskModel = taskRepository.save(taskEntity).toDomainModel();
		return taskModel;
	}

	@Override
	public Optional<Task> findById(Integer idTask) {
		return taskRepository.findById(idTask).map(el -> el.toDomainModel());
	}

	@Override
	public List<Task> findAll() {
		return taskRepository.findAll().stream().map(el -> el.toDomainModel()).collect(Collectors.toList());
	}

	@Override
	public Optional<Task> update(Task task) {
		
		if (taskRepository.existsById(task.getIdTaks())) {
			TaskEntity taskEntity = TaskEntity.fromModel(task);
			Task taskModel = taskRepository.save(taskEntity).toDomainModel();
			return Optional.of(taskModel);	
		}else {
			return Optional.empty();
		}
	}

	@Override
	public boolean deleteById(Integer idTask) {
		if (taskRepository.existsById(idTask)) {
			taskRepository.deleteById(idTask);
			return true;
		}else {
			return false;
		}
	}
}
