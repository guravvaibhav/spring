package com.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Boy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int srno;
	private int age;
	private String name;
	private String city;
	@OneToMany
	private List<Girls> girls;
	public Boy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Boy(int age, String name, String city, List<Girls> girls) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
		this.girls = girls;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public List<Girls> getGirls() {
		return girls;
	}
	public void setGirls(List<Girls> girls) {
		this.girls = girls;
	}
	@Override
	public String toString() {
		return "Boy [age=" + age + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
