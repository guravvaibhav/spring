package com.practice.oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Girlfriend {
	@Id
	private int gf_id;
	private int age;       // 25 5
	private String name;
	@ManyToOne
	private Boy boy;
	public Girlfriend() {
		super();
	}
	public Girlfriend(int gf_id, int age, String name, Boy boy) {
		super();
		this.gf_id = gf_id;
		this.age = age;
		this.name = name;
		this.boy = boy;
	}
	public int getGf_id() {
		return gf_id;
	}
	public void setGf_id(int gf_id) {
		this.gf_id = gf_id;
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
	public Boy getBoy() {
		return boy;
	}
	public void setBoy(Boy boy) {
		this.boy = boy;
	}
	@Override
	public String toString() {
		return "Girlfriend [gf_id=" + gf_id + ", age=" + age + ", name=" + name + ", boy=" + boy + "]";
	}
	
	
}



//sakshi 22 gori goripan cs 10 
//shrddha 23 gori 10th 8
//gitanjali 27 laigori civil 1