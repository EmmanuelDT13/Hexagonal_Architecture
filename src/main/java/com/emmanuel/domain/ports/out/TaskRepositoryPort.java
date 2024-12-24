package com.emmanuel.domain.ports.out;

import java.util.List;
import java.util.Optional;

import com.emmanuel.domain.models.Task;

public interface TaskRepositoryPort{

	public Task save(Task task);
	
	public Optional<Task> findById(Integer idTask);
	
	public List<Task> findAll();
	
	public Optional<Task> update(Task task);
	
	public boolean deleteById(Integer idTask);
	
}
