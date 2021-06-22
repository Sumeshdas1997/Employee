package com.employee.employeemanagementserver.bo;

public class Employee {
	
	private Long eId;
	private String eName;
	private int eAge;
	
	public Employee() {
		 
	}
	public Employee(Long eId, String eName, int eAge) {
		this.eId = eId;
		this.eName = eName;
		this.eAge = eAge;
	}
	public Long geteId() {
		return eId;
	}
	public void seteId(Long eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	
	
	

}
