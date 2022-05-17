package com.todolist.web.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Lien {
    @Id
    @ManyToOne
    private Users user;

    @ManyToOne
    private Task task;

    @Column(length = 30)
    private Date dateCreation;
}
