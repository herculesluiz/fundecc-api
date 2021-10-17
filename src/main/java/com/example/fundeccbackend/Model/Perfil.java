package com.example.fundeccbackend.Model;

import java.util.Date;
import java.util.List;

//import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@Entity(name = "perfil")
@EntityListeners(AuditingEntityListener.class)
public class Perfil{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true)
    private String nome;

    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    /*@OneToMany(mappedBy = "perfil")
    private List<Usuario> usuarios;*/

    /*@Column(name = "data_registro" , updatable = false)
    @CreatedDate
    private Date dataRegistro;*/
   
}