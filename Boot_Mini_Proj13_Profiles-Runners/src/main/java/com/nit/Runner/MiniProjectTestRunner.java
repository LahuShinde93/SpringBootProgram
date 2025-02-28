package com.nit.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.controller.EmployeeOperationController;
import com.nit.model.Employee;

@Component
public class MiniProjectTestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeOperationController controller;
	
	@Override
	public void run(String... args) throws Exception {

		List<Employee> allEmployees = controller.showAllEmployeesByDesgs("Clerk", "Salesman", "manager");
		allEmployees.forEach(emp ->System.out.println(emp)); 
	}

	
}
