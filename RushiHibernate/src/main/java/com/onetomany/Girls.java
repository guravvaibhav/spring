package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Girls {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int srno;
	private int age;
	private String name;
	private String city;
	@ManyToOne
	private Boy boy;
	public Girls() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Girls(int age, String name, String city, Boy boy) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
		this.boy = boy;
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
	public Boy getBoy() {
		return boy;
	}
	public void setBoy(Boy boy) {
		this.boy = boy;
	}
	@Override
	public String toString() {
		return "Girls [age=" + age + ", name=" + name + ", city=" + city + ", boy=" + boy + "]";
	}
	

}
