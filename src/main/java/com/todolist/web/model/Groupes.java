package com.todolist.web.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Groupes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long groupId;

    @Column(length = 50)
    private String name;

    @OneToMany(mappedBy = "groupId")
    private List<UsersInGroup> usersInGroups;

    public Groupes() {
        super();
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UsersInGroup> getUsersInGroups() {
        return usersInGroups;
    }

    public void setUsersInGroups(List<UsersInGroup> usersInGroups) {
        this.usersInGroups = usersInGroups;
    }

    public String toString() {
        return "Groupes: [id = " + groupId + " name = " + name + " ]";
    }
}
