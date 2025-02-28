package com.nit.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cust")
@ConfigurationProperties(prefix="org.nit")
@Data
public class Customer {
	
	private String customerName;
	private Integer customerId;
	private String customerAddress;
	
	//Array
	private String[] favColors;
	
	//Collections
	private List<String> nickNames;
	private Set<Long> phoneNumbers;
	private Map<String, Object> idDetails;
	
	//HAS-A Property
	//private Company company;

}
