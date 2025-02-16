package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class StudentInfo {

	@Value("${student.name}")
	private String studentName;
	
	@Value("${student.id}")
	private Integer studentId;
	
	@Value("${student.age}")
	private Integer studentAge;
	
	@Value("${student.course}")
	private String studentCourse;

	@Override
	public String toString() {
		return "StudentInfo [studentName=" + studentName + ", studentId=" + studentId + ", studentAge=" + studentAge
				+ ", studentCourse=" + studentCourse + "]";
	}
	
	
	
}
