package com.todolist.web.repository;

import com.todolist.web.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Users, String> {


    public boolean existsByLogin(String login);

    public boolean existsByLoginAndPassword(String login, String mp);

}
