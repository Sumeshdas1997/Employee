package com.employee.employeemanagementserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.employeemanagementserver.entity.EmployeeEntity;
@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long>{

}
