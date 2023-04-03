package com.nttdata.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Setter
@Getter

public class OrderDetail {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double amount;
    private double price;
    private double total;

}
