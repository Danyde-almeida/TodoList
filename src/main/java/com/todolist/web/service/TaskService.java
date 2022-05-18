package com.todolist.web.service;

import com.todolist.web.model.Task;
import com.todolist.web.model.Users;
import com.todolist.web.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    public boolean verifierTaskExistant(String nameTask, Date dateFin) {
        return taskRepository.existsByNameAndDateFin(nameTask, dateFin);
    }

    public void creeTask(Task t) {
        taskRepository.save(t);
    }


}
