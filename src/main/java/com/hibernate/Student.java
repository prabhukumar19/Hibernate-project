package com.hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
//	@OneToMany
//	private List<String> courses;

	public Student() {
		super();
	}
	
	public Student(String name, String city, List<String> courses) {
		super();
		this.name = name;
		this.city = city;
		this.courses = courses;
	}

	public Student(int id, String name, String city, List<String> courses) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.courses = courses;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

}
