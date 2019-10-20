package com.learn.ws.controller;

import com.learn.ws.domain.Employee;
import com.learn.ws.domain.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/addEmployee/{name}/{salary}/{department}", method= RequestMethod.GET)
    @ResponseBody
    public String addEmployeeData(@PathVariable("name") String name, @PathVariable("salary") Integer salary, @PathVariable("department") String department){
        Employee employee = new Employee();
        employee.setDepartment(department);
        employee.setName(name);
        employee.setSalary(salary);
        employeeRepository.save(employee);
        return "added the employee : " +name;
    }

    @RequestMapping(value="/test",method = RequestMethod.GET)
    @ResponseBody
    public String testMethod(){
        return "test passed";
    }



}
