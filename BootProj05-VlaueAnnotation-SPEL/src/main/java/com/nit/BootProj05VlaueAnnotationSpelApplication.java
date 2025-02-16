package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.Hotel;

@SpringBootApplication
public class BootProj05VlaueAnnotationSpelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj05VlaueAnnotationSpelApplication.class, args);

		// get Hotel object ref 

		Hotel hotel = ctx.getBean("hotel", Hotel.class);

		System.out.println(hotel); 

		// close the IOC Container

		((ConfigurableApplicationContext) ctx).close();

	}// Main method close

}// Class close
