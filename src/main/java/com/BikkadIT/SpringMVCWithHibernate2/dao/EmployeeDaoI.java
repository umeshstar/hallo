package com.BikkadIT.SpringMVCWithHibernate2.dao;

import java.util.List;

import com.BikkadIT.SpringMVCWithHibernate2.model.Employee;

public interface EmployeeDaoI {

	public int saveEmployee(Employee emp);
		
		public List<Employee> getAllEmployee();
	}


