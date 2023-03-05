package com.BikkadIT.SpringMVCWithHibernate2.dao;

import java.util.List;

import javax.management.Query;
import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BikkadIT.SpringMVCWithHibernate2.model.Employee;


	@Repository
	public class EmployeeDaoImpl implements EmployeeDaoI {

		@Autowired
		private SessionFactory sessionFactory;

		@Override
		public int saveEmployee(Employee emp) {

			org.hibernate.Session session = sessionFactory.openSession();
			session.beginTransaction();

			int save = (int) session.save(emp);

			session.getTransaction().commit();

			return save;
		}

		@Override
		public List<Employee> getAllEmployee() {
			 org.hibernate.Session session = sessionFactory.openSession();
			
			String query="from Employee";
			
			 org.hibernate.query.Query que = session.createQuery(query);
			List<Employee> list = que.getResultList();
			return list;
		}

	}



