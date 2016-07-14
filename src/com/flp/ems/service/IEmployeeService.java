package com.flp.ems.service;

import java.util.List;
import java.util.Map;

import com.flp.ems.domain.Employee;



public interface IEmployeeService {
		public void ModifyEmployee(Map empModifiedDetails,int empId,int ch);
		public boolean RemoveEmployee(int empId);
		
		public List<Employee> getAllEmployee();
	
		public Employee addEmployee(Map<String, Object> empDetails);
		public Employee SearchEmployee(int empId);
	}



