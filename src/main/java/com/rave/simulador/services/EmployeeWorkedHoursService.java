package com.rave.simulador.services;

import com.rave.simulador.dtos.*;
import com.rave.simulador.model.EmployeeWorkedHours;
import com.rave.simulador.model.Employees;
import com.rave.simulador.repository.EmployeeWorkedHoursRepository;
import com.rave.simulador.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeWorkedHoursService {


    @Autowired
    private EmployeeWorkedHoursRepository repository;

//    public Employees list(String full_name) {
//        Employees employee = repository.findEmployeeByName(full_name);
//        return employee;
//    }

//    public List<EmployeeWorkedHoursInsertGet> list() {
//
//        //List<Employees>  = repository.findAll();
//        List<EmployeeWorkedHoursInsertGet> employeeWorkedHoursInsertGet = new ArrayList();
////        for (Employees employees : employees) {
////
////            employeesGet.add(setEmployeesInserGet(employees));
////        }
//
//        return employeesGet;
//    }

    public EmployeeWorkedHoursInsertGet create(EmployeeWorkedHoursInsert employeeWorkedHoursInsert) {

        EmployeeWorkedHours employeeWorkedHours = newEmployeesWorkedHours(employeeWorkedHoursInsert);

        return setEmployeeWorkedHoursInserGet(employeeWorkedHours);
    }

    private EmployeeWorkedHours newEmployeesWorkedHours(EmployeeWorkedHoursInsert employeeWorkedHoursInsert) {

        EmployeeWorkedHours employeeWorkedHours = new EmployeeWorkedHours();

        employeeWorkedHours.setEmployeeId(employeeWorkedHoursInsert.getEmployeeId());
        employeeWorkedHours.setWorkedHours(employeeWorkedHoursInsert.getWorkedHours());
        employeeWorkedHours.setWorkedDate(employeeWorkedHoursInsert.getWorkedDate());


        employeeWorkedHours = repository.save(employeeWorkedHours);

        return employeeWorkedHours;
    }

//    public List<EmployeesInsertGet> createforlist(List<EmployeesInsert> employeesInsertList) {
//
//        ArrayList employeesList = new ArrayList();
//        List<EmployeesInsertGet> EmployeesInsertGetList = new ArrayList<>();
//
//        for (EmployeesInsert employeesInsert : employeesInsertList) {
//
//            Employees contrato = newEmployees(employeesInsert);
//
//            employeesList.add(contrato);
//            EmployeesInsertGetList.add(employeeWorkedHoursInsertGet(contrato));
//        }
//
//        return EmployeesInsertGetList;
//    }

    private EmployeeWorkedHoursInsertGet setEmployeeWorkedHoursInserGet(EmployeeWorkedHours employeeWorkedHours) {

        if (employeeWorkedHours == null) {
            return null;
        }

        EmployeeWorkedHoursInsertGet employeeWorkedHoursInsertGet = new EmployeeWorkedHoursInsertGet();

        employeeWorkedHoursInsertGet.setEmployeeId(employeeWorkedHours.getEmployeeId());
        employeeWorkedHoursInsertGet.setWorkedHours(employeeWorkedHours.getWorkedHours());
        employeeWorkedHoursInsertGet.setWorkedDate(employeeWorkedHours.getWorkedDate());


        return employeeWorkedHoursInsertGet;
    }
/*
    public Boolean findByContrato(ContratoFind contratoFind) {

//        List<Employees> list = new ArrayList();
//
//        if (contratoFind.getBusquedaExacta()) {
//            list.addAll(repository.findListContratoExata(contratoFind.getId(), contratoFind.getRuc(),
//                    contratoFind.getVendedor(), contratoFind.getNumFactura(), contratoFind.getNumPedido(),
//                    contratoFind.getDescripcion(),
//                    contratoFind.getTipoFactura(),
//                    contratoFind.getIva(), contratoFind.getGravada(), contratoFind.getMontoTotal(), contratoFind.getMontoIva(),
//                    contratoFind.getMontoGravada(),
//                    contratoFind.getCorreoVendedor(), contratoFind.getDepartamento(), contratoFind.getJustificacionEmployees(),
//                    contratoFind.getPrioridadEmployees(), contratoFind.getLocalidad(), contratoFind.getSituacion()));
//
//        } else {
//            list.addAll(repository.findListContrato(contratoFind.getId(), contratoFind.getRuc(), contratoFind.getNumFactura(),
//                    contratoFind.getNumPedido(),
//                    contratoFind.getDescripcion(),
//                    contratoFind.getTipoFactura(),
//                    contratoFind.getIva(), contratoFind.getGravada(), contratoFind.getMontoTotal(),
//                    contratoFind.getMontoIva(), contratoFind.getMontoGravada(),
//                    contratoFind.getVendedor(),  contratoFind.getCorreoVendedor(),
//                    contratoFind.getDepartamento(), contratoFind.getJustificacionEmployees(),
//                    contratoFind.getPrioridadEmployees(),
//                    contratoFind.getLocalidad(), contratoFind.getSituacion()));
//        }
//
//        List<EmployeesInsertGet> listGet = new ArrayList();
//
//        for (Employees contrato : list) {
//            listGet.add(setEmployeesInserGet(contrato));
//        }

        return true;
    }*/
}