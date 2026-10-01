package com.nit.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mobile_id;
	private String mobile_name;
	private String mobile_color;
	private double mobile_price;
	@OneToMany
	private List<SimCard> card;

	public int getMobile_id() {
		return mobile_id;
	}

	public void setMobile_id(int mobile_id) {
		this.mobile_id = mobile_id;
	}

	public String getMobile_name() {
		return mobile_name;
	}

	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}

	public String getMobile_color() {
		return mobile_color;
	}

	public void setMobile_color(String mobile_color) {
		this.mobile_color = mobile_color;
	}

	public double getMobile_price() {
		return mobile_price;
	}

	public void setMobile_price(double mobile_price) {
		this.mobile_price = mobile_price;
	}

	public List<SimCard> getCard() {
		return card;
	}

	public void setCard(List<SimCard> card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "Mobile [mobile_id=" + mobile_id + ", mobile_name=" + mobile_name + ", mobile_color=" + mobile_color
				+ ", mobile_price=" + mobile_price + ", card=" + card + "]";
	}
	
	
	
	
}
