package com.nit.dao;

import java.util.ArrayList;

import com.nit.dto.Mobile;
import com.nit.dto.SimCard;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MSDriver {

	public static void main(String[] args) {
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("kanhu");
			EntityManager em= emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			Mobile m=new Mobile();
			m.setMobile_color("Green");
			m.setMobile_name("Redmi Note 9 Pro Max");
			m.setMobile_price(15000);
			
			SimCard card1=new SimCard();
			card1.setSim_name("jio");
			card1.setSim_price(500);
			
			SimCard card2 =new SimCard();
			card2.setSim_name("Airtel");
			card2.setSim_price(700);
			
			ArrayList<SimCard> list=new ArrayList();
			list.add(card1);
			list.add(card2);
			
			m.setCard(list);
			et.begin();
			em.persist(card1);
			em.persist(card2);
			em.persist(m);
			et.commit();
			System.out.println("Data has been saved successfully.");
	}

}
