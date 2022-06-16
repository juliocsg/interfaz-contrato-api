package com.rave.simulador.services;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.RectangleReadOnly;
import com.itextpdf.text.pdf.PdfWriter;
import com.rave.simulador.dtos.*;
import com.rave.simulador.model.Employees;
import com.rave.simulador.model.Genders;
import com.rave.simulador.repository.EmployeesRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRAbstractBeanDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

@Service
public class EmployeesService {


    @Autowired
    private EmployeesRepository repository;

    public Employees list(String full_name) {
        Employees employee = repository.findEmployeeByName(full_name);
        return employee;
    }
    public Employees listById(Integer idEmployee) {
        Employees employee = repository.findEmployeeById(idEmployee);
        return employee;
    }

//    public List<EmployeesInsertGet> list() {
//
//        //List<Employees>  = repository.findAll();
//        List<EmployeesInsertGet> employeesGet = new ArrayList();
////        for (Employees employees : employees) {
////
////            employeesGet.add(setEmployeesInserGet(employees));
////        }
//
//        return employeesGet;
//    }



    public EmployeesInsertGet create(EmployeesInsert employeesInsert) {

        Employees employees = newEmployees(employeesInsert);

        return setEmployeesInserGet(employees);
    }

    private Employees newEmployees(EmployeesInsert employeesInsert) {

        Employees employees = new Employees();

        employees.setGenderId(employeesInsert.getGenderId());
        employees.setJobId(employeesInsert.getJobId());
        employees.setName(employeesInsert.getName());
        employees.setLastName(employeesInsert.getLastName());
        employees.setBirthDate(employeesInsert.getBirthDate());

        employees = repository.save(employees);

        return employees;
    }

    private String fileNameArquivo() {
        UUID fileNameId = UUID.randomUUID();
        String name = fileNameId.toString().replace("-", "");
        return name;
    }

    public List<EmployeesInsertGet> createforlist(List<EmployeesInsert> employeesInsertList) {

        ArrayList employeesList = new ArrayList();
        List<EmployeesInsertGet> EmployeesInsertGetList = new ArrayList<>();

        for (EmployeesInsert employeesInsert : employeesInsertList) {

            Employees contrato = newEmployees(employeesInsert);

            employeesList.add(contrato);
            EmployeesInsertGetList.add(setEmployeesInserGet(contrato));
        }

        return EmployeesInsertGetList;
    }

    private EmployeesInsertGet setEmployeesInserGet(Employees employees) {

        if (employees == null) {
            return null;
        }

        EmployeesInsertGet employeesInsertGet = new EmployeesInsertGet();

        employeesInsertGet.setGenderId(employees.getGenderId());
        employeesInsertGet.setJobId(employees.getJobId());
        employeesInsertGet.setName(employees.getName());
        employeesInsertGet.setLastName(employees.getLastName());
        employeesInsertGet.setBirthDate(employees.getBirthDate());

        return employeesInsertGet;
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