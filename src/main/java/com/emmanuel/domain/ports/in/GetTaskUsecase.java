package com.emmanuel.domain.ports.in;

import java.util.List;
import java.util.Optional;

import com.emmanuel.domain.models.Task;

public interface GetTaskUsecase {

	public List<Task> getAllTasks();
	public Optional<Task> getTask(Integer idTask);
	
}
