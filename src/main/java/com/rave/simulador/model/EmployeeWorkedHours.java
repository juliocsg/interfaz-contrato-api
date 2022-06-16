package com.rave.simulador.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class EmployeeWorkedHours {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ContratoId_Gen")
    private Integer id;
    private Integer employeeId;
    private Integer workedHours;
    private Date workedDate;
}