package com.todolist.web.controller;

import com.todolist.web.model.Users;
import com.todolist.web.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AccountController {

    @Autowired
    AccountService loginService;

    /* Partie Connexion d'un utilisateur */

    @GetMapping(value = "/")
    public ModelAndView redirectToLogin() {
        ModelAndView model = new ModelAndView();
        model.setViewName("redirect:login");
        return model;
    }

    @GetMapping(value = "/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping(value = "/login")
    public ModelAndView verifierLogin(@RequestParam String login, @RequestParam String password, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (loginService.emptyLogin(login)) {
            model.addObject("errorMessage", "Veuillez saisir votre login");
            model.addObject("login", login);
            model.addObject("mp", password);
            model.setViewName("login");
            return model;
        } else if (loginService.emptyPassword(password)) {
            model.addObject("errorMessage", "Veuillez saisir votre mot de passe");
            model.addObject("login", login);
            model.addObject("mp", password);
            model.setViewName("login");
            return model;
        } else if (loginService.verifierAuthentif(login, password)) {
            Users user = loginService.getUser(login);
            List<Users> users = loginService.getAllUser();
            users.remove(user);
            session.setAttribute("id", user.getUserId());
            session.setAttribute("username", user.getLogin());
            session.setAttribute("list_users", users);
            model.setViewName("redirect:todo-list");
            return model;
        } else {
            model.addObject("errorMessage", "Login ou mot de passe incorrect");
            model.addObject("login", login);
            model.addObject("mp", password);
            model.setViewName("login");
            return model;
        }
    }


    /* Partie Enregistrement d'un utilisateur */
    @GetMapping(value = "/register")
    public String showInscription() {
        return "inscription";
    }

    @PostMapping(value = "/register")
    public ModelAndView register(@RequestParam String login, @RequestParam String password,@RequestParam String nom,@RequestParam String prenom,HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (!loginService.verifierCompteExistant(login)) {
            Users user = new Users();
            user.setLogin(login);
            user.setPassword(password);
            user.setNom(nom);
            user.setPrenom(prenom);
            loginService.creeCompte(user);
            user = loginService.getUser(login);
            List<Users> users = loginService.getAllUser();
            users.remove(user);
            session.setAttribute("id", user.getUserId());
            session.setAttribute("username", user.getLogin());
            session.setAttribute("list_users", users);
            model.setViewName("redirect:todo-list");
        } else {
            model.addObject("errorMessage", "Compte déjà existant");
            model.setViewName("inscription");
            return model;
        }
        return model;
    }
}
