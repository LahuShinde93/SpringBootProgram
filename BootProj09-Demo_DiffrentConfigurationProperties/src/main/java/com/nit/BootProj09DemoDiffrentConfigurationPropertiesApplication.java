package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.sbeans.StudentInfo;

@SpringBootApplication
public class BootProj09DemoDiffrentConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj09DemoDiffrentConfigurationPropertiesApplication.class, args);
		
		StudentInfo std = ctx.getBean("stdInfo",StudentInfo.class);
		System.out.println(std);  
	}
 
}
