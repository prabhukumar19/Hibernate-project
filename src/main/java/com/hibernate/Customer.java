package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phone_number;
	private String city;
	
	public Customer() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Customer(String name, String email, long phone_number, String city) {
		super();
//		this.id = id;
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
		this.city = city;
	}
	
	public Customer(int id, String name, String email, long phone_number, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone_number=" + phone_number
				+ ", city=" + city + "]";
	}
	

}
