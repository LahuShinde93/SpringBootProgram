package com.nit.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("stdInfo")
@ConfigurationProperties(prefix="org.nit")
@Data
public class StudentInfo {
 
	private String studentName;
	private Integer studentAge; 
	 
	Integer[]courseFees;   
	
	private List<String> studentCourses; 
	private Set<Integer> studentIds;  
	private Map<String,String> mailId_Pass;  
	
	
	
}
