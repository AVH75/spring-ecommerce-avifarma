package com.nttdata.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table
@Getter
@Setter
public class Order {
    private Integer id;
    private String number;
    private Date creationDate;
    private Date dateReceived;
    private double total;
}
