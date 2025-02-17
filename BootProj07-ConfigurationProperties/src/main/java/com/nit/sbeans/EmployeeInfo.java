package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("info")
@Data
@ConfigurationProperties(prefix = "org.nit")
public class EmployeeInfo {

	private Integer empId;
	private String empName;
	private String empDesig;
	
	@Value("${org.nit.age}")  
	private Integer empAge;
	
	
}
