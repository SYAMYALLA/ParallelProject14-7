package com.flp.ems.domain;

public class Role {
	private int Role_id;
	private String RName;
	private String RDesc;
	public int getRole_id() {
		return Role_id;
	}
	public void setRole_id(int role_id) {
		Role_id = role_id;
	}
	public String getRName() {
		return RName;
	}
	public void setRName(String rName) {
		RName = rName;
	}
	public String getRDesc() {
		return RDesc;
	}
	public void setRDesc(String rDesc) {
		RDesc = rDesc;
	}
	public Role setRole(Role role)
	{
		return role;
	}
	@Override
	public String toString() {
		return "Role [Role_id=" + Role_id + ", RName=" + RName + ", RDesc=" + RDesc + "]";
	}
	
}
