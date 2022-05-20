package com.todolist.web.repository;

import com.todolist.web.model.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Groups, String> {
    public Groups getByGroupId(long idGroup);
    public boolean existsByName(String name);
}
