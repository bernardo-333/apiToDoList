package com.example.ToDoList.repositories;

import com.example.ToDoList.entity.Tarefas;
import com.example.ToDoList.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas, Long> {

}
