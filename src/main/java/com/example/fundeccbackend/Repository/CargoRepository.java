package com.example.fundeccbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fundeccbackend.Model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long>{

}
