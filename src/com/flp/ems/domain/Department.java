package com.flp.ems.domain;

public class Department {
	
	private int Dept_id;
	private String DeptName;
	private String DeptDesc;
	public int getDept_id() {
		return Dept_id;
	}
	public void setDept_id(int dept_id) {
		Dept_id = dept_id;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	public String getDeptDesc() {
		return DeptDesc;
	}
	public void setDeptDesc(String deptDesc) {
		DeptDesc = deptDesc;
	}
	
	public Department setDepartment(Department department) {
	return department;
	}
	@Override
	public String toString() {
		return "Department [Dept_id=" + Dept_id + ", DeptName=" + DeptName + ", DeptDesc=" + DeptDesc + "]";
	}
	

}
