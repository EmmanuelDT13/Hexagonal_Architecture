package com.emmanuel.domain.ports.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emmanuel.domain.models.Task;

@Repository
public interface TaskRepositoryPort extends JpaRepository<Task, Integer>{

}
