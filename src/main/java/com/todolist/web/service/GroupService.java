package com.todolist.web.service;

import com.todolist.web.model.Groupes;
import com.todolist.web.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    @Autowired
    GroupRepository groupRepository;

    public void creeGroup(Groupes g) {
        groupRepository.save(g);
    }
    public List<Groupes> allGroup() {
        return groupRepository.findAll();
    }

    public Groupes getGroupById(long idGroup){ return groupRepository.getByGroupId(idGroup);}
    public boolean existGroup(String str){return groupRepository.existsByName(str);}


}
