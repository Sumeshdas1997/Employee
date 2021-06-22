package com.employee.employeemanagementserver.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeemanagementserver.bo.Employee;
import com.employee.employeemanagementserver.service.EmployeeService;

@RestController
public class EmployeeController {

	// @Autowired
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {

		this.employeeService = employeeService;
	}

	@GetMapping("/hello")
	public String getMessage() {
		System.out.println("getMessage method start in EmployeeController class");
		// EmployeeService employeeServiceImpl = new EmployeeServiceImpl();
		String message = employeeService.getMessage();
		System.out.println("getMessage method end in EmployeeController class");
		return message;
	}

	@PostMapping("/hello")
	public String getMessage1() {
		System.out.println("getMessage method start in EmployeeController class");
		// EmployeeService employeeServiceImpl = new EmployeeServiceImpl();
		String message = employeeService.getMessage();
		System.out.println("getMessage method end in EmployeeController class");
		return message;
	}

	@GetMapping("/getallemployee")
	public List<Employee> getAllEmployee()

	{
		List<Employee> emplist = employeeService.getAllEmployee();

		return emplist;
	}

	@GetMapping("/getemployeebyid/{id}")
	public Employee getEmployeeId(@PathVariable("id") Long id)

	{
		Employee employee = employeeService.getEmployeeById(id);

		return employee;
	}

	@DeleteMapping("/deleteemployeebyid/{id}")
	public void deleteEmployeeId(@PathVariable("id") Long id)

	{
		employeeService.deleteEmployeeById(id);

	}
	
	@PostMapping(value="/createemployee",consumes=MediaType.APPLICATION_JSON_VALUE)
	public Employee createEmployee(@RequestBody Employee employee) {
		
		Employee emp = employeeService.createEmployee(employee);
		return emp;
	}
	
	@PutMapping("/updateemployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		Employee emp = employeeService.updateEmployee(employee);
		return emp;
	}


}
