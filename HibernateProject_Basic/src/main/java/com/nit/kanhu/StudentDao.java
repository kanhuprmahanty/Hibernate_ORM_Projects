package com.nit.kanhu;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDao {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("kanhu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Student s= new Student();
//		s.setName("badal");
//		s.setBranch("IT");
//		s.setMobileno(7788776659l);
		
//		et.begin();
//		em.persist(s);
//		et.commit();
		
//		Student s1= em.find(Student.class, 3);
//		System.out.println(s1.getId());
//		System.out.println(s1.getBranch());
//		System.out.println(s1.getMobileno());
//		System.out.println(s1.getName());
//		System.out.println("data fetched succesfully....");
		
		Student s3=em.find(Student.class, 4);
		
		
		
		
		System.out.println("Data has been inserted  successfully");
	}

}
