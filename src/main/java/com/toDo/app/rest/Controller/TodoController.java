package com.toDo.app.rest.Controller;

import com.toDo.app.rest.Model.Task;
import com.toDo.app.rest.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoRepository repositorio;

    @GetMapping("/")
    public String hola(){
        return "Hola mundo!";
    }

    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return repositorio.findAll();
    }

    @PostMapping(value = "/savetask")
    public String saveTask(@RequestBody Task task){
        repositorio.save(task);
        return "saved task";
    }

    @PutMapping("/update/{id}")
    public String updateTask(@PathVariable Long id, @RequestBody Task task){
        Task updatedTask = repositorio.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));;
        updatedTask.setTitulo(task.getTitulo());
        updatedTask.setDescripcion(task.getDescripcion());
        repositorio.save(updatedTask);
        return "Updated task";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id){
        repositorio.deleteById(id);
        return "Deleted task";
    }
}
