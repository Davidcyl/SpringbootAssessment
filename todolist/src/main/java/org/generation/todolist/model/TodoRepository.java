package org.generation.todolist.model;

import org.springframework.data.repository.CrudRepository;

//TodoRepository inherit all the methods from the CrudRepository Interface via extends to perform basic CRUD operations
//Integer is used for us to pass in an id for a search in database
public interface TodoRepository extends CrudRepository<Todo, Integer> {
}

