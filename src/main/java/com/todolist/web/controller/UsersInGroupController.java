package com.todolist.web.controller;

import com.todolist.web.model.UsersInGroup;
import com.todolist.web.service.UsersInGroupsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UsersInGroupController {

    @Autowired
    UsersInGroupsServices usersInGroupsServices;

    @GetMapping(value = "/addUsersToGroup")
    public ModelAndView addUsersToGroup(HttpSession session,
                                 @RequestParam long idGroup,
                                 @RequestParam(defaultValue = "") List<String> groupUsers) {
        ModelAndView model = new ModelAndView();
        long idUser = (long) session.getAttribute("id");
        UsersInGroup usersInGroup = new UsersInGroup(idUser,idGroup);
        usersInGroupsServices.creeUsersInGroups(usersInGroup);

        if (!groupUsers.isEmpty()) {
            for (String s : groupUsers) {
                idUser = Long.parseLong(s);
                usersInGroup = new UsersInGroup(idUser, idGroup);
                usersInGroupsServices.creeUsersInGroups(usersInGroup);
            }
        }
        //Afficher un message de validation
        model.setViewName("redirect:addTask");
        return model;
    }

}
