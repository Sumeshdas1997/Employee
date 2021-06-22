package com.employee.employeemanagementserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeetable")
public class EmployeeEntity {
	@Id
	@GeneratedValue
	private Long eId;
	@Column(name="ename")
	private String eName;
	@Column(name="eage")
	private int eAge;
	
	public EmployeeEntity() {
		 
	}
	public EmployeeEntity(Long eId, String eName, int eAge) {
		super();
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
