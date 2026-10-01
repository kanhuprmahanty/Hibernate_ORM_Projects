package com.nit.dao;

import java.util.ArrayList;

import com.nit.dto.Course;
import com.nit.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SCDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("kanhu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		Student s1=new Student();
		s1.setStudent_branch("IT");
		s1.setStudent_name("Kanhu");
		
		Student s2=new Student();
		s2.setStudent_branch("IT");
		s2.setStudent_name("suman");
		
		Course c1=new Course();
		c1.setCourse_name("Full Stack Java");
		c1.setCourse_price(30000);
		
		Course c2=new Course();
		c2.setCourse_name("Full Stack Python");
		c2.setCourse_price(30000);
		
		ArrayList<Course> list=new ArrayList<Course>();
		list.add(c1);
		list.add(c2);
		
		s1.setCourse(list);
		s2.setCourse(list);
		
		ArrayList<Student> list1=new ArrayList<Student>();
		list1.add(s1);
		list1.add(s2);
		
		c1.setStudent(list1);
		c2.setStudent(list1);
		
		et.begin();
		em.persist(c1);
		em.persist(c2);		
		em.persist(s1);
		em.persist(s2);
		et.commit();
		
		System.out.println("Data has been saved successfully");

	}

}
