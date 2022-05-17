package com.todolist.web.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(length = 50)
    private String login;

    @Column(length = 50)
    private String password;

    @Column(length = 50)
    private String nom;

    @Column(length = 50)
    private String prenom;

    @OneToMany(mappedBy = "user")
    private List<Lien> lien;

    public Users() {
        super();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String mp) {
        this.password = mp;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String toString() {
        return "Users [login= " + login + ", mp= " + password + " ]";
    }
}
