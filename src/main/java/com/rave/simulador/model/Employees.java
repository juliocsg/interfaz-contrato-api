package com.rave.simulador.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ContratoId_Gen")
    private Integer id;
    private Integer genderId;
    private Integer jobId;
    private String name;
    private String lastName;
    private Date birthDate;



}