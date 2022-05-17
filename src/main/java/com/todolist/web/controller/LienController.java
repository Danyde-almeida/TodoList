package com.todolist.web.controller;

import com.todolist.web.model.Users;
import com.todolist.web.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LienController {

    @Autowired
    AccountService loginService;

    /* Partie Connexion d'un utilisateur */

    @GetMapping(value = "/todo-list")
    public String showLogin() {
        return "todo-list";
    }

    @PostMapping(value = "/todo-list")
    public ModelAndView verifierLogin(@RequestParam String login, @RequestParam String password) {
        ModelAndView model = new ModelAndView();
        return model;
    }
}
