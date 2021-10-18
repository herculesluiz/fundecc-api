package com.example.fundeccbackend.Controllers;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import com.example.fundeccbackend.Model.Perfil;
import com.example.fundeccbackend.Repository.PerfilRepository;

@RestController
@AllArgsConstructor
//@RequestMapping("/cargos")
public class PerfilController{

    private PerfilRepository perfilRepo;

    @GetMapping("/perfis")
    public List<Perfil> listarPerfil(){
        return perfilRepo.findAll();
    }

    @GetMapping("perfis/{id}")
    public Perfil buscarPerfil(@PathVariable Long id){
        return perfilRepo.findById(id).get();
    }


    @PostMapping("/perfis")
    @ResponseStatus(HttpStatus.CREATED)
    public Perfil inserirPerfil(@RequestBody Perfil perfil){
        return perfilRepo.save(perfil);
    }

    @PutMapping("/perfil")
    public Perfil editarPerfil(@RequestBody Perfil perfil){
        return perfilRepo.save(perfil);
    }

    @DeleteMapping("perfis/{id}")
    public void deletePerfil(@PathVariable Long id){
        perfilRepo.deleteById(id);
    }
}