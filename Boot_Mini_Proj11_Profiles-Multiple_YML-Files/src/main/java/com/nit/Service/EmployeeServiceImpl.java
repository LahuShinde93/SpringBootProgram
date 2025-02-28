package com.nit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nit.dao.EmployeeDAO;
import com.nit.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private EmployeeDAO empDAO;

	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl:: 0-param Constructor..");
	}

	@Override
	public List<Employee> fetchEmployeesByDesg(String desg1, String desg2, String desg3) throws Exception {
		// Convert desg into UpperCase Letters

		desg1 = desg1.toUpperCase();
		desg2 = desg2.toUpperCase();
		desg3 = desg3.toUpperCase();

		// Use DAO
		List<Employee> list = empDAO.fetchEmployeeByDesg(desg1, desg2, desg3);

		// Sort the object in List Collection
		list.sort((t1, t2) -> t1.getEmpno().compareTo(t2.getEmpno()));

		// Calculate gross salary and netSalary

		list.forEach(emp -> {
			emp.setGrossSalary(emp.getSalary() + (emp.getSalary() * 0.5));
			emp.setNetSalary(emp.getGrossSalary() - (emp.getGrossSalary() * 0.2));
		});

		return list;
	}

	@Override
	public String registerEmployee(Employee emp) throws Exception {
		
		System.out.println("EmployeeServiceImpl.registerEmployee()");
		int count = empDAO.insertEmployee(emp);

		return count == 0 ? "Employee not registered" : "Employee is registered";
	}

}
