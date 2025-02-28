package com.nit.Runners;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountStatementReportRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("AccountStatementReportRunner.run()(AR)");
		 
		//Display non-option args values
		System.out.println("Non-Option arg values : "+args.getNonOptionArgs());
		
		System.out.println("Option Arg Values are::");
		//get option args name
		Set<String> optArgNames=args.getOptionNames();
		
		optArgNames.forEach(name->{
		  System.out.println(name+"..."+args.getOptionValues(name));
		});
	}

}
