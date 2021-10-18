package com.example.fundeccbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.fundeccbackend.Model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}