package com.nit.dao;

import com.nit.dto.PanCard;
import com.nit.dto.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PPDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("kanhu");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p=new Person();
		p.setPerson_name("kanhu");
		p.setPerson_address("Khallingi");
		p.setPerson_age(23);
		
		PanCard card=new PanCard();
		card.setCard_name("Kanhu prasad mahanty");
		card.setCard_num("IND383773");
		
		p.setPancard(card);
		card.setP(p);
		
		
//		et.begin();
//		em.persist(p);
//		em.persist(card);
//		
//		et.commit();
//		System.out.println("Data has been inserted successfully.");
		
		

	}

}
