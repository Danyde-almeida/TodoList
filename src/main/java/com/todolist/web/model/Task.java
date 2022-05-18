package com.todolist.web.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTask;

    @Column(length = 30)
    private String name;

    private Date dateDebut;
    private Date dateFin;
    private boolean status;
    private boolean shared;
    @OneToMany(mappedBy = "task")
    private List<Lien> lien;

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public List<Lien> getLien() {
        return lien;
    }

    public void setLien(List<Lien> lien) {
        this.lien = lien;
    }

    public String toString() {
        return "TODO";
    }
}
