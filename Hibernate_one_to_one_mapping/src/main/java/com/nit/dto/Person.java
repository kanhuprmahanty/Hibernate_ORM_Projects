package com.nit.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Person {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int p_id;
		private int p_age;
		private String p_name;
		private String p_loc;
		
		@OneToOne
		Pancard card;

		public int getP_age() {
			return p_age;
		}

		public void setP_age(int p_age) {
			this.p_age = p_age;
		}

		public int getP_id() {
			return p_id;
		}

		public void setP_id(int p_id) {
			this.p_id = p_id;
		}

		public String getP_name() {
			return p_name;
		}

		public void setP_name(String p_name) {
			this.p_name = p_name;
		}

		public String getP_loc() {
			return p_loc;
		}

		public void setP_loc(String p_loc) {
			this.p_loc = p_loc;
		}

		public Pancard getCard() {
			return card;
		}

		public void setCard(Pancard card) {
			this.card = card;
		}

		@Override
		public String toString() {
			return "Person [p_age=" + p_age + ", p_id=" + p_id + ", p_name=" + p_name + ", p_loc=" + p_loc + ", card="
					+ card + "]";
		}
		
}
