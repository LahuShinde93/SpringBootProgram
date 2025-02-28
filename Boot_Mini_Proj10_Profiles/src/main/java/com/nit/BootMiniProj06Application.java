package com.nit;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nit.controller.EmployeeOperationController;
import com.nit.model.Employee;
  
@SpringBootApplication
public class BootMiniProj06Application {  
     
	public static void main(String[] args) throws Exception 
	{   
		try( 
		ConfigurableApplicationContext ctx = SpringApplication.run(BootMiniProj04Application.class, args);
				Scanner sc = new Scanner(System.in);
		){ 
		//Get controller class obj reference 
		EmployeeOperationController controller = ctx.getBean("payroll", EmployeeOperationController.class);
		
		System.out.println("Enter the employee No : ");
		Integer empNo = sc.nextInt();
		 
		System.out.println("Enter the employee Name : ");
		String name = sc.nextLine();
		name = sc.nextLine();
		
		System.out.println("Enter the employee designatation : ");
		String desg = sc.nextLine();
		
		System.out.println("Enter the employee salary : ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter the Dept no(10,20,30,....) : ");
		Integer deptno = sc.nextInt();
		
		//create employee class obj
		Employee emp = new Employee();
		
		emp.setEname(name);
		emp.setSalary(salary); 
		emp.setDeptno(deptno);
		emp.setDesg(desg);
		emp.setEmpno(empNo);
		
		 
			
			String msg = controller.appointEmployee(emp);
			
			//Display the result
			System.out.println(msg);
			
		} catch(SQLException e) {
		System.out.println("Internal problem :: "+e.getMessage());

	}
}//Main
}//class
