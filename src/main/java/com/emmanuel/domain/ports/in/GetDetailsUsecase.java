package com.emmanuel.domain.ports.in;

import java.util.Optional;
import com.emmanuel.domain.models.TaskDetails;

public interface GetDetailsUsecase {

	public Optional<TaskDetails> getTaskDetails(Integer idTask);
	
}
