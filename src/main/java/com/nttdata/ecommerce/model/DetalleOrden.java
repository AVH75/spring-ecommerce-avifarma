package com.nttdata.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.management.ConstructorParameters;
import javax.persistence.*;

@Entity
@Table
@Setter
@Getter

public class DetalleOrden {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private double cantidad;
    private double precio;
    private double total;

}
