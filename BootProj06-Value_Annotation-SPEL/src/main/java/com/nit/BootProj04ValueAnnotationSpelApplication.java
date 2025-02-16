package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.StudentInfo;

@SpringBootApplication
public class BootProj04ValueAnnotationSpelApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootProj04ValueAnnotationSpelApplication.class, args);
	
	StudentInfo info =ctx.getBean("std",StudentInfo.class);
	
	System.out.println(info);
	 
	//close the IOC Container
	
	((ConfigurableApplicationContext) ctx).close();
	}

}
