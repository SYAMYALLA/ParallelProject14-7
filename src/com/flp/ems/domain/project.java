package com.flp.ems.domain;

public class project {
	private Department department;
	private String ProName;
	private int Pro_id;
	private String ProDescription;
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getProName() {
		return ProName;
	}
	public void setProName(String proName) {
		ProName = proName;
	}
	public int getPro_id() {
		return Pro_id;
	}
	public void setPro_id(int pro_id) {
		Pro_id = pro_id;
	}
	public String getProDescription() {
		return ProDescription;
	}
	public void setProDescription(String proDescription) {
		ProDescription = proDescription;
	}
	public project setProject(project p)
	{
	return p;
	}
	@Override
	public String toString() {
		return "project [department=" + department + ", ProName=" + ProName + ", Pro_id=" + Pro_id + ", ProDescription="
				+ ProDescription + "]";
	}
	
	

}
