package com.nit.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Person {
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private int person_id;
		private String person_name;
		private int person_age;
		private String person_address;
		
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "Card_id")
		private PanCard pancard;


		public int getPerson_id() {
			return person_id;
		}


		public void setPerson_id(int person_id) {
			this.person_id = person_id;
		}


		public String getPerson_name() {
			return person_name;
		}


		public void setPerson_name(String person_name) {
			this.person_name = person_name;
		}


		public int getPerson_age() {
			return person_age;
		}


		public void setPerson_age(int person_age) {
			this.person_age = person_age;
		}


		public String getPerson_address() {
			return person_address;
		}


		public void setPerson_address(String person_address) {
			this.person_address = person_address;
		}


		public PanCard getPancard() {
			return pancard;
		}


		public void setPancard(PanCard pancard) {
			this.pancard = pancard;
		}


		@Override
		public String toString() {
			return "Person [person_id=" + person_id + ", person_name=" + person_name + ", person_age=" + person_age
					+ ", person_address=" + person_address + "]";
		}


		
		
		
}
