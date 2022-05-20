package com.todolist.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(DoubleGroupId.class)
public class UsersInGroup {
    @Id
    @Column(name="userId")
    private long userId;
    @Id
    @Column(name="groupId")
    private long groupId;

    public UsersInGroup(long userId, long groupId){
        super();
        this.userId = userId;
        this.groupId = groupId;
    }

    public UsersInGroup() {
        super();
    }

    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public long getTaskId() {
        return groupId;
    }
    public void setTaskId(long groupId) {
        this.groupId = groupId;
    }

    public String toString() {
        return "user: " + userId + ", group: " + groupId;
    }
}
