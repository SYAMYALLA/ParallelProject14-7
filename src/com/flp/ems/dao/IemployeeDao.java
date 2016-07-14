package com.flp.ems.dao;

import java.util.List;
import java.util.Map;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {
	

		public void ModifyEmployee(Map empModifiedDetails,int empId,int ch);
		public boolean RemoveEmployee(int empId);
		
		public List<Employee> getAllEmployee();
		public Employee addEmployee(Employee employee);
		public Employee SearchEmployee(int empId);
	
		 

	}



