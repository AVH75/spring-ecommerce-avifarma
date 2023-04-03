package com.nttdata.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.management.ConstructorParameters;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Getter
@Setter


public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String username;
    private String email;
    private String direccion;
    private String telefono;
    private String tipo;
    private String password;





}
