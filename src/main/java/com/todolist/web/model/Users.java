package com.todolist.web.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(length = 50)
    private String login;

    @Column(length = 50)
    private String password;

    @Column(length = 50)
    private String nom;

    @Column(length = 50)
    private String prenom;

    @OneToMany(mappedBy = "userId")
    private List<Lien> lien;

    @OneToMany(mappedBy = "userId")
    private List<UsersInGroup> usersInGroups;

    public Users() {
        super();
    }
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId ) {
        this.userId = userId;
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

    public List<Lien> getLien() {
        return lien;
    }

    public void setLien(List<Lien> lien) {
        this.lien = lien;
    }
    public List<UsersInGroup> getUsersInGroups() {
        return usersInGroups;
    }
    public void setUsersInGroups(List<UsersInGroup> usersInGroups) {
        this.usersInGroups = usersInGroups;
    }
    public String toString() {
        return "Users: [id = " + userId + " login = " + login + " + nom = " + nom + " prenom = "+ prenom + " ]";
    }
}
