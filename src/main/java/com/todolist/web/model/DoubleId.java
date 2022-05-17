package com.todolist.web.model;

import java.io.Serializable;

public class DoubleId implements Serializable {
    private Task task;
    private Users user;

    // default constructor
    public DoubleId(Task task, Users user) {
        this.task = task;
        this.user = user;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

}
