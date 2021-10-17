package com.example.fundeccbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fundeccbackend.Model.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long>{

}
