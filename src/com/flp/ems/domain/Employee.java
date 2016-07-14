package com.flp.ems.domain;

public class Employee {
	public Department department;
	public project project;
	public Role role;
	
	private int empid;
	private String empName;

	private String Email;
	private String phone_no;
	private String DOB;
	private String DOJ;
	private String empAddress;
	public Department getDepartment() {
	return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public project getProject() {
		return project;
	}
	public void setProject(project project) {
		this.project = project;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [department=" + department + ", project=" + project + ", role=" + role + ", empid=" + empid
				+ ", empName=" + empName + ", Email=" + Email + ", phone_no=" + phone_no + ", DOB=" + DOB + ", DOJ="
				+ DOJ + ", empAddress=" + empAddress + "]";
	}
	
	
	
	
	

}
