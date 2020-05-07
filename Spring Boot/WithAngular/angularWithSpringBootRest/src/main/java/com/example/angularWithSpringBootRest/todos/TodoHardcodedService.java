package com.example.angularWithSpringBootRest.todos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList();
	private static int idCounter = 0;
	
	static {
		
		todos.add(new Todo(++idCounter,"sipi", "Let's Azure NOW!", false, new Date()));
		todos.add(new Todo(++idCounter,"sipi","Become an expert on Spring Boot", false, new Date()));
		todos.add(new Todo(++idCounter,"sipi", "Master Angular", false, new Date()));
		todos.add(new Todo(++idCounter,"sipi","Pro Linux", false, new Date()));
		todos.add(new Todo(++idCounter,"sipi","Professional Docker", false, new Date()));
	    
	}
	
	public List<Todo> retriveAllTodo() {
		return todos;
	}
	
	public Todo findById(long id) {
		
		for (Todo todo : todos) {
			if(todo.getId() == id)
				return todo;
		}
		return null;
	}
	
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		
		if(todo == null) return null;
		if(todos.remove(todo)) {
			return todo;
		}
		return null;
				
	}
		
}
