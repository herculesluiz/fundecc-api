package com.example.fundeccbackend.Controllers;

import java.util.List;



//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


//import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import lombok.AllArgsConstructor;

import com.example.fundeccbackend.Model.Cargo;
import com.example.fundeccbackend.Repository.CargoRepository;

@RestController
@AllArgsConstructor
//@RequestMapping("/cargos")
public class CargoController{


    private CargoRepository cargoRepo;

    @GetMapping("/cargos")
    public List<Cargo> listarCargo(){
        return cargoRepo.findAll();
    }

    @GetMapping("cargos/{id}")
    public Cargo buscarCargo(@PathVariable Long id){
        return cargoRepo.findById(id).get();
    }


    @PostMapping("/cargos")
    public Cargo inserirCargo(@RequestBody Cargo cargo){
        return cargoRepo.save(cargo);
    }

    @PutMapping("/cargos")
    public Cargo editarCargo(@RequestBody Cargo cargo){
        return cargoRepo.save(cargo);
        
    }

    
}