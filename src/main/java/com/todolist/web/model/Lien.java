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
}
