package com.employee.employeemanagementserver.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeemanagementserver.bo.Employee;
import com.employee.employeemanagementserver.entity.EmployeeEntity;
import com.employee.employeemanagementserver.repository.EmployeeRepository;
import com.employee.employeemanagementserver.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	

	@Override
	public String getMessage() {
		System.out.println("getMessage method start in EmployeeServiceImpl class");
		String msg =  "welcome to Hello world!!!! message from EmployeeServiceImpl ";
		System.out.println("getMessage method end in EmployeeServiceImpl class");
		return msg;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> emplist= new ArrayList<Employee>();
		
		Iterable<EmployeeEntity>  employeeiterable =employeeRepository.findAll();
		Iterator<EmployeeEntity>  itr = employeeiterable.iterator();
		while(itr.hasNext()) {
			EmployeeEntity emplEntity = itr.next();
			
			Employee employee = new Employee(emplEntity.geteId(),emplEntity.geteName(),emplEntity.geteAge());
			
			emplist.add(employee);
		}
		
		return emplist;
	}

	@Override
	public Employee getEmployeeById(Long id) {
		 
		EmployeeEntity emplEntity = employeeRepository.findById(id).get();
		Employee employee = new Employee(emplEntity.geteId(),emplEntity.geteName(),emplEntity.geteAge());
		
		return employee;
	}

	@Override
	public void deleteEmployeeById(Long Id) {
		employeeRepository.deleteById(Id);
		 
	}

	@Override
	public Employee createEmployee(Employee employee) {
		
		EmployeeEntity emplEntity = new EmployeeEntity();
		emplEntity.seteName(employee.geteName());
		emplEntity.seteAge(employee.geteAge());
		
		employeeRepository.save(emplEntity);
		
		Employee emp = new Employee(emplEntity.geteId(),emplEntity.geteName(),emplEntity.geteAge());
		
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		//first find then update
		
		EmployeeEntity emplEntity = employeeRepository.findById(employee.geteId()).get();
		
		if(emplEntity!=null)
		{
			emplEntity.seteAge(employee.geteAge());
			emplEntity.seteName(employee.geteName());
			employeeRepository.save(emplEntity);
		}
		 //returning updated value
		Employee emp1 = new Employee(emplEntity.geteId(),emplEntity.geteName(),emplEntity.geteAge());
		return emp1;
	}

}
