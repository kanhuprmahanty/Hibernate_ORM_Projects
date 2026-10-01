package com.nit.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Pancard {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int card_id;
		private String card_num;
		private String card_name;
		public int getCard_id() {
			return card_id;
		}
		public void setCard_id(int card_id) {
			this.card_id = card_id;
		}
		public String getCard_num() {
			return card_num;
		}
		public void setCard_num(String card_num) {
			this.card_num = card_num;
		}
		public String getCard_name() {
			return card_name;
		}
		public void setCard_name(String card_name) {
			this.card_name = card_name;
		}
		@Override
		public String toString() {
			return "Pancard [card_id=" + card_id + ", card_num=" + card_num + ", card_name=" + card_name + "]";
		}
		
		
		
		
		
		
}
