package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nit.model.Employee;
 
@Repository("empMySqlDAO")
@Profile({"dev","test"})
public class EmployeeMySqlDAOImpl implements EmployeeDAO {
	private static final String GET_EMPS_BY_DESGS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?)";
	
	private static final String INSERT_EMPLOYEE ="INSERT INTO EMP(EMPNO,SAL,JOB,DEPTNO)VALUES(?,?,?,?)";
	
	@Autowired
	private DataSource ds; 
	
	

	public EmployeeMySqlDAOImpl() {
		System.out.println("EmployeeMySqlDAOImpl:: 0-param constructor..");
	}

	@Override
	public List<Employee> fetchEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeServiceImp:: DataSource obj ::"+ds.getClass());

		System.out.println("EmployeeMySqlDAOImpl.fetchEmployeeByDesg()");
		List<Employee> list = null; 

		// Get pooled connection
		try (Connection con = ds.getConnection();

				// Creating PreparedStatement by making the Query pre-compiled SQL Query
				PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DESGS);) {

			// set values to Query params
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);

			try (
					// execute the select Query
					ResultSet rs = ps.executeQuery();) {

				list = new ArrayList<Employee>();

				while (rs.next()) {

					// Copy each record values to the Java bean obj
					Employee emp = new Employee(); 

					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setDesg(rs.getString(3)); // Corrected
					emp.setSalary(rs.getDouble(4)); // Corrected
					emp.setDeptno(rs.getInt(5));

					// Add Java bean class obj to List collection

					list.add(emp);
				}

			} // try 2

		} // try 1

		catch (SQLException se) {
			throw se; // Exception rethrowing for Propagation
		}

		catch (Exception e) {
			throw e; // Exception rethrowing for Propagation
		}

		return list;

	}

	@Override
	public int insertEmployee(Employee emp) throws Exception {
		System.out.println("EmployeeServiceImp:: DataSource obj ::"+ds.getClass());

		System.out.println("EmployeeMySqlDAOImpl.insertEmployee()");
		try( //Get pooled jdbc connection obj 
				Connection con =ds.getConnection();
				//create preparedStatement obj
				PreparedStatement ps = con.prepareStatement(INSERT_EMPLOYEE);
				){
			
			//set values to query params
			ps.setInt(1, emp.getEmpno());
			ps.setDouble(2, emp.getSalary());
			ps.setString(3, emp.getDesg());
			ps.setInt(4, emp.getDeptno());
			
			//Execute the SQL Query
			int count = ps.executeUpdate();
			
			return count; 
		}//Try
		catch(SQLException se) {
			throw se;
		}catch(Exception e) {
			throw e;
		}
	}
}
