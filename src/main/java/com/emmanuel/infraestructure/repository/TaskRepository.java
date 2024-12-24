package com.emmanuel.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.emmanuel.infraestructure.entitie.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Integer>{

}
