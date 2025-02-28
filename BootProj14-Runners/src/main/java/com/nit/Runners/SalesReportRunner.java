package com.nit.Runners;


import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class SalesReportRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SalesReportRunner.run()(CLR)");
		
		System.out.println("Command line args are : "+Arrays.toString(args));
	}
}
