package com.toDo.app.rest.Repository;

import com.toDo.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Task,Long> {


}
