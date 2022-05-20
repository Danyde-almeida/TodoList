package com.todolist.web.service;

import com.todolist.web.model.Groups;
import com.todolist.web.model.UsersInGroup;
import com.todolist.web.repository.UsersInGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersInGroupsServices {
    @Autowired
    UsersInGroupsRepository uigRepository;
    public void creeUsersInGroups(UsersInGroup uig) {
        uigRepository.save(uig);
    }

}
