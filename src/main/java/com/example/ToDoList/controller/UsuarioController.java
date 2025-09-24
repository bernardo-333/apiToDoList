package com.example.ToDoList.controller;

import com.example.ToDoList.entity.Usuario;
import com.example.ToDoList.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository user;

    @GetMapping("salvar")
    public Usuario salvar() {
        Usuario usuario = new Usuario("deivão","2133","davidga1193@gmail.com");
        return user.save(usuario);
    }

    @GetMapping("mostrar")
    public List<Usuario> mostrar(){
        List<Usuario> usuario = user.findAll();
        return usuario;
    }


}
