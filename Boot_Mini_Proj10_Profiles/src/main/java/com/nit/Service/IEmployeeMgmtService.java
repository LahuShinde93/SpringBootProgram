package com.nit.Service;

import java.util.List;

import com.nit.model.Employee;

public interface IEmployeeMgmtService {

	public List<Employee> fetchEmployeesByDesg(String desg1, String desg2,String desg3) throws Exception;
	public String registerEmployee(Employee emp) throws Exception;
		
	
}
