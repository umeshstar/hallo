package com.BikkadIT.SpringMVCWithHibernate2.service;

import java.util.List;

import com.BikkadIT.SpringMVCWithHibernate2.model.Employee;

public interface EmployeeServiceI {

	public int saveEmployee(Employee emp);

	public List<Employee> getAllEmployees();
}