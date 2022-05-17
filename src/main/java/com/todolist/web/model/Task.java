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
    private Date dateDebut;
    private Date dateFin;
    private String status;
    private String type;

    @OneToMany(mappedBy = "task")
    private List<Lien> lien;

}
