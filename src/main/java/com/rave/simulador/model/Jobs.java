package com.rave.simulador.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ContratoId_Gen")
    private Integer id;
    private String name;
    private Double salary;
}