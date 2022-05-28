package com.todolist.web.controller;

import com.todolist.web.model.Groupes;
import com.todolist.web.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping(value = "/addGroup")
    public ModelAndView showAddGroup() {
        ModelAndView model = new ModelAndView();
        model.setViewName("addGroup");
        return model;
    }

    @PostMapping(value = "/addGroup")
    public ModelAndView addGroup(@RequestParam String nameGroup,
                                 @RequestParam(defaultValue = "") List<String> users) {
        ModelAndView model = new ModelAndView();
        Groupes group = new Groupes();
        group.setName(nameGroup);
        if (!users.isEmpty() && !groupService.existGroup(nameGroup)){
            groupService.creeGroup(group);
            model.addObject("groupUsers",users);
            model.addObject("idGroup",group.getGroupId());
            model.setViewName("redirect:addUsersToGroup");
        }else {
            model.setViewName("redirect:addGroup");
        }
        return model;
    }
}
