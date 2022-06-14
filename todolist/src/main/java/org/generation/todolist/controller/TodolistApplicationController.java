package org.generation.todolist.controller;


import org.generation.todolist.model.Todo;
import org.generation.todolist.model.TodoRepository;
import org.generation.todolist.model.User;
import org.generation.todolist.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//For API Mapping
@RestController
public class TodolistApplicationController {


    @Autowired
    TodoRepository todoRepository; //Spring injects todoRepository when TodoRepository is created.

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/todos") /*The @GetMapping methods in the @Controller annotated classes handle the HTTP GET requests matched with given URI expression.*/
    public Iterable<Todo> todos() {
        return todoRepository.findAll();
    }

    @GetMapping(value = "/users")
    public Iterable<User> users() {
        return userRepository.findAll();
    }


}
