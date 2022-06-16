package com.rave.simulador.dtos;

import lombok.Data;

import java.sql.Date;

@Data
public class EmployeeWorkedHoursInsertGet {
    private Integer employeeId;
    private Integer workedHours;
    private Date workedDate;
}