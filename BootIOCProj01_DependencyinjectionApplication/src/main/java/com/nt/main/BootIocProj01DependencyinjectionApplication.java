package com.nt.main;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.main.sbeans.SeasonFinder;

@SpringBootApplication 
public class BootIocProj01DependencyinjectionApplication {

    @Bean(name = "ld")  
    LocalDate getLocalDate() {    
        return LocalDate.now();
    }   

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BootIocProj01DependencyinjectionApplication.class, args);
        SeasonFinder seasonFind = ctx.getBean("sf", SeasonFinder.class);
        String currentSeason = seasonFind.findSeason();
        System.out.println(currentSeason);   
        ((ConfigurableApplicationContext) ctx).close(); 
    }
}