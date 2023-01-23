package com.c4cydonia.tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.c4cydonia.tasks.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
