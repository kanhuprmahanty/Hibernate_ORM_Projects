package com.nit.dao;

import com.nit.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeDao {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kanhu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Employee e=new Employee();
		e.setName("suman");
		e.setDept("IT");
		e.setSalary(5000);
		e.setMob_num(909098787l);

		et.begin();
		em.persist(e);
		et.commit();
		System.out.println("Your data has been inserted successfully");
	}

}
