package com.emmanuel.domain.ports.in;

import com.emmanuel.domain.models.Task;

public interface CreateTaskUsecase {

	public Task createTask(Task task);
	
}
