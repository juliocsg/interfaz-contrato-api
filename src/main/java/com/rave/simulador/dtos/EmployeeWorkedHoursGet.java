package com.rave.simulador.dtos;

import lombok.Data;

import java.sql.Date;

@Data
public class EmployeeWorkedHoursGet {
    private Integer employeeId;
    private Integer workedHours;
    private Date workedDate;
}