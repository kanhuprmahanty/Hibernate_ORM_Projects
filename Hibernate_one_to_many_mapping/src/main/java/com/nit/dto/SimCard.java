package com.nit.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SimCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sim_id;
	private String sim_name;
	private double sim_price;
	public int getSim_id() {
		return sim_id;
	}
	public void setSim_id(int sim_id) {
		this.sim_id = sim_id;
	}
	public String getSim_name() {
		return sim_name;
	}
	public void setSim_name(String sim_name) {
		this.sim_name = sim_name;
	}
	public double getSim_price() {
		return sim_price;
	}
	public void setSim_price(double sim_price) {
		this.sim_price = sim_price;
	}
	@Override
	public String toString() {
		return "SimCard [sim_id=" + sim_id + ", sim_name=" + sim_name + ", sim_price=" + sim_price + "]";
	}
	
	
	
}
