package com.todolist.web.service;

import com.todolist.web.model.Groups;
import com.todolist.web.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    @Autowired
    GroupRepository groupRepository;

    public void creeGroup(Groups g) {
        groupRepository.save(g);
    }

}
