package br.com.reynaldosoares.todolist_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reynaldosoares.todolist_spring.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
