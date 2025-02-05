package com.ni.main;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ni.main.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootIocProj02DependencyinjectionApplication {

	@Bean(name="lt")
	  LocalTime getLocalTime() {
		return LocalTime.now();
	}
	      
	public static void main(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(BootIocProj02DependencyinjectionApplication.class, args);
		 WishMessageGenerator msg = ctx.getBean("wmg",WishMessageGenerator.class);
		 String message = msg.generateMessage("Shinde");
		 System.out.println(message);  
	}

}
