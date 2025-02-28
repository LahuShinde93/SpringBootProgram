package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.sbeans.Customer;

@SpringBootApplication
public class BootProj08DiffrentConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj08DiffrentConfigurationPropertiesApplication.class,
				args);

		Customer cts = ctx.getBean("cust", Customer.class);

		System.out.println(cts);
	}

}
