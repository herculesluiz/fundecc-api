package com.example.fundeccbackend.Controllers;

import java.util.List;

import com.example.fundeccbackend.Model.Usuario;
import com.example.fundeccbackend.Repository.UsuarioRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UsuarioController {
    
    private UsuarioRepository usuarioRepo;

    @GetMapping("/usuarios")
    public List<Usuario> listarUsuario(){
        return usuarioRepo.findAll();
    }

    @GetMapping("usuarios/{id}")
    public Usuario buscarUsuario(@PathVariable Long id){
        return usuarioRepo.findById(id).get();
    }


    @PostMapping("/usuarios")
    public Usuario inserirUsuario(@RequestBody Usuario user){
        return usuarioRepo.save(user);
    }

    @PutMapping("/usuarios")
    public Usuario editarUsuario(@RequestBody Usuario user){
        return usuarioRepo.save(user);
    }
}
