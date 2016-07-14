package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Role;
import com.flp.ems.domain.project;

public class EmplyeeDaoImplForList implements IemployeeDao{
	List<Employee>employees=new ArrayList<Employee>();
	List<Department>departments=new ArrayList<Department>();
	List<project>projects=new ArrayList<project>();
	List<Role>roles=new ArrayList<Role>();

	public Employee addEmployee( Employee emp)
	{
		employees.add(emp);
		departments.add(emp.getDepartment());
		projects.add(emp.getProject());
		roles.add(emp.getRole());
		return emp;
	}

	public void ModifyEmployee(Map empModifiedDetails,int empId,int ch) {
		Employee emp=SearchEmployee(empId);
		int index=employees.indexOf(emp);
		RemoveEmployee(empId);
		switch(ch)
		{
		case 1:emp.setEmpName((String) empModifiedDetails.get("empName"));
				employees.add(index,emp);
				break;
		case 2:emp.setEmail((String) empModifiedDetails.get("email"));
				employees.add(index,emp);
				break;
		}
	}

	
	public boolean RemoveEmployee(int empId) {
	
		for (Employee emp : employees) {
		       if (emp.getEmpid() == empId){
		          employees.remove(emp);
		          return true;
		       }
		 }
		return false;
	}

	public Employee SearchEmployee(int empId) 
	{
		 for(Employee emp : employees) {
		        if(emp.getEmpid() == empId)
		        {
		        	return emp;
		        }
		  }
		 return null;
	}
	
	public List<Employee> getAllEmployee() {
		if(employees.isEmpty())
			return null;
		return employees;
	}

}
