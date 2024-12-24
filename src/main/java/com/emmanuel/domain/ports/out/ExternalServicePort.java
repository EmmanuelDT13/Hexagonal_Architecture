package com.emmanuel.domain.ports.out;

import com.emmanuel.domain.models.TaskDetails;

public interface ExternalServicePort {

	public TaskDetails getTaskDetails(Integer idTask);
	
}
