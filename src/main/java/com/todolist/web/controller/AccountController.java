package com.todolist.web.controller;

import com.todolist.web.model.Users;
import com.todolist.web.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

    @Autowired
    AccountService loginService;

    /* Partie Connexion d'un utilisateur */

    @GetMapping(value = "/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping(value = "/login")
    public ModelAndView verifierLogin(@RequestParam String login, @RequestParam String password) {
        ModelAndView model = new ModelAndView();

        if (loginService.emptyLogin(login)) {
            model.addObject("errorMessage", "Veuillez saisir votre login");
            model.addObject("login", login);
            model.addObject("mp", password);
            model.setViewName("login");
            System.out.println("1");
            return model;
        } else if (loginService.emptyPassword(password)) {
            model.addObject("errorMessage", "Veuillez saisir votre mot de passe");
            model.addObject("login", login);
            model.addObject("mp", password);
            model.setViewName("login");
            System.out.println("2");
            return model;
        } else if (loginService.verifierAuthentif(login, password)) {
            model.addObject("identifiant", login);
            System.out.println("3");
            model.setViewName("welcome");
            return model;
        } else {
            model.addObject("errorMessage", "Login ou mot de passe incorrect");
            model.addObject("login", login);
            model.addObject("mp", password);
            System.out.println("4");
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
    public ModelAndView register(@RequestParam String login, @RequestParam String password,@RequestParam String nom,@RequestParam String prenom) {
        ModelAndView model = new ModelAndView();

        if (!loginService.verifierCompteExistant(login)) {
            Users c = new Users();
            c.setLogin(login);
            c.setPassword(password);
            c.setNom(nom);
            c.setPrenom(prenom);
            loginService.creeCompte(c);
            model.setViewName("welcome");
        } else {
            model.addObject("erreur", "Compte déjà existant");
            model.setViewName("inscription");
            return model;
        }
        return model;
    }
}
