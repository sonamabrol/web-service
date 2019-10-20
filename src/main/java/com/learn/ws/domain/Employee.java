package com.learn.ws.domain;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="EMPLOYEE")
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String department;
    private Integer salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
