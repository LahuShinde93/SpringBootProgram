package com.nit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import com.nit.controller.EmployeeOperationController;
import com.nit.model.Employee;
  
@SpringBootApplication 
public class BootMiniProj04Application {  
       
	public static void main(String[] args) throws Exception 
	{ 
		ApplicationContext ctx = SpringApplication.run(BootMiniProj04Application.class, args);
		 
		//Get controller class obj reference 
		EmployeeOperationController controller = ctx.getBean("payroll", EmployeeOperationController.class);
		 
		//Active profile are
		Environment env = ctx.getEnvironment();
		System.out.println("Current Active Env is : "+Arrays.toString(env.getActiveProfiles()));
		
		List<Employee> allEmployees = controller.showAllEmployeesByDesgs("Clerk", "Salesman", "manager");
		allEmployees.forEach(emp ->System.out.println(emp)); 
	} 
}
