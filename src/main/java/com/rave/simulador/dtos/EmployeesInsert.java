package com.rave.simulador.dtos;

import lombok.Data;

import java.sql.Date;

@Data
public class EmployeesInsert {
    private Integer genderId;
    private Integer jobId;
    private String name;
    private String lastName;
    private Date birthDate;

}