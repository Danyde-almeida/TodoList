package com.todolist.web.controller;

import com.todolist.web.model.Task;
import com.todolist.web.model.Users;
import com.todolist.web.service.AccountService;
import com.todolist.web.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TaskController {
    @Autowired
    TaskService taskService;

    /*
   *****************************************************************
           Affichage des Taches
   *****************************************************************
    */
    @GetMapping(value = "/todo-list")
    public ModelAndView showTodoList(HttpSession session) {
        ModelAndView model = new ModelAndView();
        long idUser = (long) session.getAttribute("id");
        List<Task> taskListShared = taskService.getAllTaskByShared(idUser,true);
        List<Task> taskListNotShared = taskService.getAllTaskByShared(idUser,false);
        model.addObject("taskListShared",taskListShared);
        model.addObject("taskListNotShared",taskListNotShared);
        model.setViewName("todo-list");
        return model;
    }

    @PostMapping(value = "/todo-list")
    public ModelAndView checkTodoList(HttpSession session,
                                      @RequestParam(defaultValue = "") List<String> validate) throws ParseException {
        ModelAndView model = new ModelAndView();
        long idUser = (long) session.getAttribute("id");
        List<Task> taskListShared = taskService.getAllTaskByShared(idUser,true);
        List<Task> taskListNotShared = taskService.getAllTaskByShared(idUser,false);

        for (Task t: taskListNotShared) {
            if (!t.isStatus() && validate.contains(String.valueOf(t.getTaskId()))){
                t.setStatus(true);
                System.out.println(t);
                taskService.updateTasks(t);
            }else if (t.isStatus() && !validate.contains(String.valueOf(t.getTaskId()))){
                t.setStatus(false);
                taskService.updateTasks(t);
            }
        }
        for (Task t: taskListShared) {
            if (!t.isStatus() && validate.contains(String.valueOf(t.getTaskId()))){
                t.setStatus(true);
                taskService.updateTasks(t);
            }else if (t.isStatus() && !validate.contains(String.valueOf(t.getTaskId()))){
                t.setStatus(false);
                taskService.updateTasks(t);
            }
        }
        model.setViewName("redirect:todo-list");
        return model;
    }

    /*
    *****************************************************************
            Ajout de Taches
    *****************************************************************
     */
    @GetMapping(value = "/addTask")
    public String showAddTask() {
        return "addTask";
    }

    @PostMapping(value = "/addTask")
    public ModelAndView addTask(HttpSession session,
                                @RequestParam String nameTask,
                                @RequestParam String dateFin,
                                @RequestParam(defaultValue = "") List<String> users) throws ParseException {
        ModelAndView model = new ModelAndView();
        Date dateEnd = new SimpleDateFormat("yyyy-MM-dd").parse(dateFin);
        if (!taskService.verifierTaskExistant(nameTask, dateEnd)) {
            //On crée la tache
            Task task = new Task();
            task.setCreatorId((Long) session.getAttribute("id"));
            task.setName(nameTask);
            task.setDateDebut(new Date());
            task.setDateFin(dateEnd);
            task.setStatus(false);
            if (users.isEmpty())
                task.setShared(false);
            else{
                task.setShared(true);
            }
            taskService.creeTask(task);
            //redirection
            model.addObject("SharedPersons",users);
            model.addObject("idTask", task.getTaskId());
            model.setViewName("redirect:lien");
        }
        return model;
    }
}
