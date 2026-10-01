package com.nit.dao;

import com.nit.dto.Pancard;
import com.nit.dto.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PPDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("kanhu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		Person p=new Person();
		p.setP_name("Kanhu prasad mahanty");
		p.setP_age(22);
		p.setP_loc("Hyderabad");
		
		Pancard card=new Pancard();
		card.setCard_name("Kanhu Prasad Mahanty");
		card.setCard_num("78KHF789");
		
		p.setCard(card);
		
		et.begin();
		em.persist(p);
		em.persist(card);
		
		et.commit();
		System.out.println("Data is inserted successfully.");

	}

}
