package com.todolist.web.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long taskId;
    @Column(length = 30)
    private String name;
    private Date dateDebut;
    private Date dateFin;
    private boolean status;
    private boolean shared;
    @OneToMany(mappedBy = "taskId")
    private List<Lien> lien;

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
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
        return "id = " + taskId + ", name = " + name + ", dateDebut = " + dateDebut + ", dateFin = " + dateFin + ", status = " + status + ", shared = " + shared;
    }
}
