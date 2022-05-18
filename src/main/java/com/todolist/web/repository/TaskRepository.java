package com.todolist.web.repository;

import com.todolist.web.model.Task;
import com.todolist.web.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {
    public boolean existsByNameAndDateFin(String name, Date dateFin);
}
