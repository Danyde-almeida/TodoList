package com.todolist.web.service;

import com.todolist.web.model.Users;
import com.todolist.web.repository.AccountRepository;
import com.todolist.web.repository.LienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LienService {

    @Autowired
    LienRepository lienRepository;
}
