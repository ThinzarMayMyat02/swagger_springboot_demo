package com.sip.swigger.swigger_spring_demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sip.swigger.swigger_spring_demo.model.Employee;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class EmployeeController {
    private List<Employee> employees=createList();

    @RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
    public List<Employee>firstPage(){
        return employees;
    }

    @DeleteMapping(value = "/{id}")
    public Employee deleteEmployee(@PathVariable("id")String id){
        Employee deleteEmp=null;
        for(Employee emp: employees){
            if(emp.getEmpId().equals(id)){
                employees.remove(emp);
                deleteEmp=emp;
                break;
            }
        }
           return deleteEmp;
    }

    @PostMapping(value = "createEmp")
    public Employee create(@RequestBody Employee user){
        employees.add(user);
        System.out.println(employees.toString());
        return user;
    }

    private static List<Employee> createList() {
        List<Employee> tempEmployees=new ArrayList<>();
        Employee e1=new Employee();
        e1.setId(1);
        e1.setName("Zaw Zaw");
        e1.setDesignation("Manager");
        e1.setSalary(3000.0);

        Employee e2=new Employee();
        e2.setId(2);
        e2.setName("Thaw Thaw");
        e2.setDesignation("Staff");
        e2.setSalary(1500);

        tempEmployees.add(e2);
        tempEmployees.add(e1);
        return tempEmployees;
    }
}
