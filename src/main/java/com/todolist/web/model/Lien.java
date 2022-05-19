package com.todolist.web.model;

import org.apache.catalina.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(DoubleId.class)
public class Lien {
    @Id
    @Column(name="userId")
    private long userId;
    @Id
    @Column(name="taskId")
    private long taskId;
    public Lien(long user, long task){
        super();
        this.userId = user;
        this.taskId = task;
    }
    public Lien() {
        super();
    }

    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String toString() {
        return "user: " + userId + ", task: " + taskId;
    }
}
