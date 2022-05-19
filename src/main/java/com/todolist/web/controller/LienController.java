package com.todolist.web.controller;

import com.todolist.web.model.Lien;
import com.todolist.web.model.Task;
import com.todolist.web.model.Users;
import com.todolist.web.service.AccountService;
import com.todolist.web.service.LienService;
import com.todolist.web.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LienController {

    @Autowired
    LienService lienService;
    @Autowired
    AccountService accountService;
    @Autowired
    TaskService taskService;


    @GetMapping(value = "/lien")
    public ModelAndView showLien(HttpSession session, @RequestParam long idTask) {
        ModelAndView model = new ModelAndView();
        System.out.println(session.getAttribute("id"));
        long idUser = (long) session.getAttribute("id");
        System.out.println(idUser);
        Lien lien = new Lien(idUser,idTask);
        lienService.creeLien(lien);

        //Afficher un message de validation
        model.addObject("message", "Votre tache a été enregistrée");
        model.setViewName("redirect:addTask");
        return model;
    }

}
