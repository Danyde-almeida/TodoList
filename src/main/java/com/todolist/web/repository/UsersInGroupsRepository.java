package com.todolist.web.repository;

import com.todolist.web.model.Lien;
import com.todolist.web.model.UsersInGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersInGroupsRepository extends JpaRepository<UsersInGroup, String> {

}
