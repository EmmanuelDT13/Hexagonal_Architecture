package com.emmanuel.domain.ports.in;

import java.util.Optional;
import com.emmanuel.domain.models.Task;

public interface UpdateTaskUsecase {

	public Optional<Task> UpdateTask(Integer idTask, Task task);
	
}
