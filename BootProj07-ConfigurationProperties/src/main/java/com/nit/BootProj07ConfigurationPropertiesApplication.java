package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.sbeans.EmployeeInfo;

@SpringBootApplication
public class BootProj07ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj07ConfigurationPropertiesApplication.class, args);
		EmployeeInfo info = ctx.getBean("info",EmployeeInfo.class);
		System.out.println(info);
	}   

}
