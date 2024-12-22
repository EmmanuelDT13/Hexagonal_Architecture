package com.emmanuel.domain.ports.out;

import java.util.Optional;

import com.emmanuel.domain.models.TaskDetails;

public interface ExternalServicePort {

	public Optional<TaskDetails> getTaskDetails(Integer idTask);
	
}
