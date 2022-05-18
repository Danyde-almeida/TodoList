package com.todolist.web.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(DoubleId.class)
public class Lien {
    @Id
    @ManyToOne
    private Users user;

    @Id
    @ManyToOne
    private Task task;

    @Column(length = 30)
    private Date dateCreation;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String toString() {
        return "TODO";
    }
}
