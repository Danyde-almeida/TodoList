package com.todolist.web.controller;

import com.todolist.web.model.Task;
import com.todolist.web.model.Users;
import com.todolist.web.service.AccountService;
import com.todolist.web.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping(value = "/todo-list")
    public String showTodoList() {
        return "todo-list";
    }
    @GetMapping(value = "/addTask")
    public String showAddTask() {
        return "addTask";
    }
    @PostMapping(value = "/addTask")
    public ModelAndView addTask(@RequestParam String nameTask, @RequestParam String dateFin) throws ParseException {
        ModelAndView model = new ModelAndView();
        Date dateEnd = new SimpleDateFormat("yyyy-MM-dd").parse(dateFin);
        if (!taskService.verifierTaskExistant(nameTask, dateEnd)) {
            //On crée la tache
            Task task = new Task();
            task.setName(nameTask);
            task.setDateDebut(new Date());
            task.setDateFin(dateEnd);
            task.setStatus(false);
            task.setStatus(false);
            taskService.creeTask(task);
            //redirection
            model.addObject("idTask", task.getTaskId());
            model.setViewName("redirect:lien");
        }
        return model;
    }
}
