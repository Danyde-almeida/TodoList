package com.todolist.web.repository;

import com.todolist.web.model.Groupes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Groupes, String> {
    public Groupes getByGroupId(long idGroup);
    public boolean existsByName(String name);
}
