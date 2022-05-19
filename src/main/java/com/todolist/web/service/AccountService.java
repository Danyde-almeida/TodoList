package com.todolist.web.service;

import com.todolist.web.model.Users;
import com.todolist.web.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;
    public boolean emptyLogin(String login) {
        return login.equals("");
    }
    public boolean emptyPassword(String password) {
        return password.equals("");
    }
    //Verif base de donnée
    public boolean verifierAuthentif(String login, String password) {
        return accountRepository.existsByLoginAndPassword(login, password);
    }
    public Users getUser(String login){return accountRepository.getByLogin(login);}
    public List<Users> getAllUser(){return accountRepository.findAll();}
    public boolean verifierCompteExistant(String login) {
        return accountRepository.existsByLogin(login);
    }
    public void creeCompte(Users c) {
        accountRepository.save(c);
    }

}
