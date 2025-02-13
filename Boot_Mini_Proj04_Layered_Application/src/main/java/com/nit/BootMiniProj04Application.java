package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.controller.EmployeeOperationController;
import com.nit.model.Employee;
  
@SpringBootApplication
public class BootMiniProj04Application {  
     
	public static void main(String[] args) throws Exception 
	{ 
		ApplicationContext ctx = SpringApplication.run(BootMiniProj04Application.class, args);
		 
		//Get controller class obj reference 
		EmployeeOperationController controller = ctx.getBean("payroll", EmployeeOperationController.class);
		
		List<Employee> allEmployees = controller.showAllEmployeesByDesgs("Clerk", "Salesman", "manager");
		allEmployees.forEach(emp ->System.out.println(emp)); 
	} 
  
}
