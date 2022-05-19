package com.todolist.web.repository;

import com.todolist.web.model.Task;
import com.todolist.web.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {
    public boolean existsByNameAndDateFin(String name, Date dateFin);
    public Task getByTaskId(long id);
    @Query("select t from Task t join t.lien l where l.userId=:userId and t.shared=:bool")
    public List<Task> findAllByShared(@Param("userId") long userId, @Param("bool") boolean bool);
}
