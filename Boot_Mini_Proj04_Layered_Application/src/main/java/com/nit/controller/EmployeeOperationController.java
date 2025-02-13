package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.Service.IEmployeeMgmtService;
import com.nit.model.Employee;

@Controller("payroll")
public class EmployeeOperationController {
  
	@Autowired 
	private IEmployeeMgmtService service;
 
	public List<Employee> showAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
 
		// Use Service 
		List<Employee> list = service.fetchEmployeesByDesg(desg1, desg2, desg3);


		return list; 
	} // method close
	
	public String appointEmployee(Employee emp) throws Exception {
		//User service
		String msg = service.registerEmployee(emp);
		return msg; 
	}
} // class close 
