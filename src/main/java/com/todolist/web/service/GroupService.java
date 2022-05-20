package com.todolist.web.service;

import com.todolist.web.model.Groups;
import com.todolist.web.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    @Autowired
    GroupRepository groupRepository;

    public void creeGroup(Groups g) {
        groupRepository.save(g);
    }
    public List<Groups> allGroup() {
        return groupRepository.findAll();
    }

    public Groups getGroupById(long idGroup){ return groupRepository.getByGroupId(idGroup);}


}
