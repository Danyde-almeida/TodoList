package com.todolist.web.model;

import java.io.Serializable;

public class DoubleGroupId implements Serializable {

    private long userId;
    private long groupId;

    // default constructor
    public DoubleGroupId() {
    }

    public DoubleGroupId(long userId, long groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }

    public long getTaskId() {
        return groupId;
    }

    public void setTaskId(long groupId) {
        this.groupId = groupId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

}
