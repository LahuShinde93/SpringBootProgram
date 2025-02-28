package com.nit.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable {

    private Integer empno;
    private String ename;
    private String desg;
    private Double salary;
    private Integer deptno;  

    // for Gross and Net Salary
    private Double grossSalary;
    private Double netSalary;
}
