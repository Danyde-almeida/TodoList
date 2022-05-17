package com.todolist.web.repository;

import com.todolist.web.model.Lien;
import com.todolist.web.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LienRepository extends JpaRepository<Lien, String> {

}
