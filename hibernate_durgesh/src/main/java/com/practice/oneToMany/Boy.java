package com.practice.oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Boy {
	@Id
	private int boy_id;
	private String name;
	private int age;
	@OneToMany(mappedBy = "boy")
	private List<Girlfriend> girlfriends;
	public Boy() {
		super();
	}
	public Boy(int boy_id, String name, int age, List<Girlfriend> girlfriends) {
		super();
		this.boy_id = boy_id;
		this.name = name;
		this.age = age;
		this.girlfriends = girlfriends;
	}
	public int getBoy_id() {
		return boy_id;
	}
	public void setBoy_id(int boy_id) {
		this.boy_id = boy_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Girlfriend> getGirlfriends() {
		return girlfriends;
	}
	public void setGirlfriends(List<Girlfriend> girlfriends) {
		this.girlfriends = girlfriends;
	}
	@Override
	public String toString() {
		return "Boy [boy_id=" + boy_id + ", name=" + name + ", age=" + age + ", girlfriends=" + girlfriends + "]";
	}
	
	
}
