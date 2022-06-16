package com.rave.simulador.dtos;

import lombok.Data;

import java.sql.Date;

@Data
public class EmployeeWorkedHoursFind {
    private Integer employeeId;
    private Integer workedHours;
    private Date workedDate;
}