package com.employee.employeemanagementserver.service;

import java.util.List;

import com.employee.employeemanagementserver.bo.Employee;

public interface EmployeeService {
	
	public String getMessage();
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeById(Long Id);
	
	public void deleteEmployeeById(Long Id);

	public Employee createEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	 

}
