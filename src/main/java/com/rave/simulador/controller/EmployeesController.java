package com.rave.simulador.controller;

import com.rave.simulador.dtos.*;

import com.rave.simulador.model.Employees;
import com.rave.simulador.model.Genders;
import com.rave.simulador.model.Jobs;
import com.rave.simulador.services.EmployeesService;
import com.rave.simulador.services.GendersService;
import com.rave.simulador.services.JobsService;
import net.sf.jasperreports.engine.JRException;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestController
@RequestMapping({ "/employees" })
public class EmployeesController {

    @Autowired
    private EmployeesService service;

    @Autowired
    private GendersService serviceGenders;

    @Autowired
    private JobsService serviceJobs;

    @PostMapping(value = "/createForList")
    public ResponseEntity<List> createforlist(@RequestBody List<EmployeesInsert> contratoList) {

        try {

            List<EmployeesInsertGet> employeesInsertList = service.createforlist(contratoList);

            return ResponseEntity.ok().body(employeesInsertList);

        } catch (Exception e) {
            // TODO: handle exception
        }

        return ResponseEntity.badRequest().build();
    }
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
    public ResponseEntity<Object> createEmployees(@RequestBody EmployeesInsert employeesInsert) {
        try {
            Genders genders = serviceGenders.list(employeesInsert.getGenderId());
            Jobs jobs = serviceJobs.list(employeesInsert.getJobId());
            String full_name = employeesInsert.getName().toUpperCase().trim() + " " + employeesInsert.getLastName().toUpperCase().trim();
            Employees employee = service.list(full_name);
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fechaNac = LocalDate.parse(employeesInsert.getBirthDate().toString(), fmt);
            LocalDate ahora = LocalDate.now();
            Period periodo = Period.between(fechaNac, ahora);

            if (employee == null && periodo.getYears() >= 18 && genders != null && jobs != null){
                List<Boolean> success = new ArrayList();
                success.add(true);
                EmployeesInsertGet employees = service.create(employeesInsert);
                return ResponseEntity.ok().body(success);
            }
            else {
                List<Integer> idGender = new ArrayList();
                idGender.add(employeesInsert.getGenderId());
                return ResponseEntity.badRequest().body(idGender);
            }
    //            return ResponseEntity.ok().body(service.updateProcesso(contrato, idCamunda));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("No funciona. "+ e);
        }

    }
}
