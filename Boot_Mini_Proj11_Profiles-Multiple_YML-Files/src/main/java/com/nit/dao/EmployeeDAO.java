package com.nit.dao;

import java.util.List;

import com.nit.model.Employee;

public interface EmployeeDAO {

	//Fetching data form the database
	public List<Employee> fetchEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception; 
	
	//Inserting the data into database
	public int insertEmployee(Employee emp)throws Exception;
}
