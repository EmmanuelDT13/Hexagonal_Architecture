package com.emmanuel.domain.ports.in;

import com.emmanuel.domain.models.TaskDetails;

public interface GetDetailsUsecase {

	public TaskDetails getTaskDetails(Integer idTask);
	
}
