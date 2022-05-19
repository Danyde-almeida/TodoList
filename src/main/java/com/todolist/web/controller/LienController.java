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
import java.util.List;

@Controller
public class LienController {

    @Autowired
    LienService lienService;

    @GetMapping(value = "/lien")
    public ModelAndView showLien(HttpSession session, @RequestParam long idTask, @RequestParam(defaultValue = "") List<String> SharedPersons) {
        ModelAndView model = new ModelAndView();
        long idUser = (long) session.getAttribute("id");
        Lien lien = new Lien(idUser,idTask);
        lienService.creeLien(lien);
        if (!SharedPersons.isEmpty()) {
            for (String s : SharedPersons) {
                idUser = Long.parseLong(s);
                lien = new Lien(idUser, idTask);
                lienService.creeLien(lien);
            }
        }
        //Afficher un message de validation
        model.setViewName("redirect:todo-list");
        return model;
    }

}
