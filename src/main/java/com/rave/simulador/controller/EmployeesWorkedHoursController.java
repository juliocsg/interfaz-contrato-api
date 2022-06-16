package com.rave.simulador.controller;

import com.rave.simulador.dtos.EmployeeWorkedHoursInsert;
import com.rave.simulador.dtos.EmployeeWorkedHoursInsertGet;
import com.rave.simulador.dtos.EmployeesInsert;
import com.rave.simulador.dtos.EmployeesInsertGet;
import com.rave.simulador.model.EmployeeWorkedHours;
import com.rave.simulador.model.Employees;
import com.rave.simulador.model.Genders;
import com.rave.simulador.model.Jobs;
import com.rave.simulador.services.EmployeeWorkedHoursService;
import com.rave.simulador.services.EmployeesService;
import com.rave.simulador.services.GendersService;
import com.rave.simulador.services.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({ "/employeesWorkedHours" })
public class EmployeesWorkedHoursController {

    @Autowired
    private EmployeeWorkedHoursService service;

    @Autowired
    private EmployeesService serviceEmployee;

    @Autowired
    private GendersService serviceGenders;

    @Autowired
    private JobsService serviceJobs;

//    @PostMapping(value = "/createForList")
//    public ResponseEntity<List> createforlist(@RequestBody List<EmployeesInsert> contratoList) {
//
//        try {
//
//            List<EmployeesInsertGet> employeesInsertList = service.createforlist(contratoList);
//
//            return ResponseEntity.ok().body(employeesInsertList);
//
//        } catch (Exception e) {
//            // TODO: handle exception
//        }
//
//        return ResponseEntity.badRequest().build();
//    }
    /*
    *@GetMapping(path = { "/{id}" })
    public ResponseEntity<ContratoInsertGet> findById(@PathVariable long id) {
        ContratoInsertGet contrato = service.findById(id);

        if (contrato != null) {
            return ResponseEntity.ok().body(contrato);
        }

        return ResponseEntity.notFound().build();
    }

    * */
    @PostMapping
    public ResponseEntity<Object> createEmployeesWorkedHours(@RequestBody EmployeeWorkedHoursInsert employeeWorkedHoursInsert) {
        try {
              Employees employees = serviceEmployee.listById(employeeWorkedHoursInsert.getEmployeeId());

            if (employees != null && employeeWorkedHoursInsert.getWorkedHours() <= 20 && employeeWorkedHoursInsert.getWorkedDate().compareTo(Date.valueOf(LocalDate.now())) <= 0) {
                List<Boolean> success = new ArrayList();
                success.add(true);
                EmployeeWorkedHoursInsertGet employeeWorkedHours = service.create(employeeWorkedHoursInsert);
                return ResponseEntity.ok().body(success);
            }
            else {
                List<Integer> idEmployee = new ArrayList();
                idEmployee.add(employeeWorkedHoursInsert.getEmployeeId());
                return ResponseEntity.badRequest().body(idEmployee);
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("No funciona. "+ e);
        }

    }
}
