package com.nit.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class PanCard {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int card_id;
	private String card_name;
	private String card_num;
	@OneToOne(mappedBy = "pancard")
	private Person p;
	public int getCard_id() {
		return card_id;
	}
	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}
	public String getCard_name() {
		return card_name;
	}
	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}
	public String getCard_num() {
		return card_num;
	}
	public void setCard_num(String card_num) {
		this.card_num = card_num;
	}
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "PanCard [card_id=" + card_id + ", card_name=" + card_name + ", card_num=" + card_num + "]";
	}
	
	
	
	
	
}
