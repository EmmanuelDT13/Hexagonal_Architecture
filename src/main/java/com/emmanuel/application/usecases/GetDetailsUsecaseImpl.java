package com.emmanuel.application.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emmanuel.domain.ports.out.ExternalServicePort;
import com.emmanuel.domain.models.TaskDetails;
import com.emmanuel.domain.ports.in.GetDetailsUsecase;

@Service
public class GetDetailsUsecaseImpl implements GetDetailsUsecase{

	@Autowired
	private ExternalServicePort externalServicePort;
	
	@Override
	public TaskDetails getTaskDetails(Integer idTask) {
		// TODO Auto-generated method stub
		return externalServicePort.getTaskDetails(idTask);
	}

}
