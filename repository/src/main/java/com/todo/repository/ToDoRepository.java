package com.todo.repository;


import java.util.List;
import com.todo.ToDoItem;

public interface ToDoRepository
{
    List<ToDoItem> findAll();

    List<ToDoItem> findAllActive();

    List<ToDoItem> findAllCompleted();

    ToDoItem findById(Long id);

    Long insert(ToDoItem toDoItem);

    void update(ToDoItem toDoItem);

    void delete(ToDoItem toDoItem);
}