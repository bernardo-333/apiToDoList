package com.example.ToDoList.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //alteração
    private String nome;
    private String email;
    private String senha;

}
