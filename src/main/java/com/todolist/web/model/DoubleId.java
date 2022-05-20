package com.todolist.web.model;

import java.io.Serializable;

public class DoubleId implements Serializable {

    private long userId;
    private long taskId;

    // default constructor
    public DoubleId() {
    }

    public DoubleId(long userId, long taskId) {
        this.userId = userId;
        this.taskId = taskId;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

}
