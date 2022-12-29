package com.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Voter {
	@Id
	private int v_id;
	private String city;
	@OneToOne
	private Person person;

	public Voter() {
		super();
	}

	public Voter(int v_id, String city) {
		super();
		this.v_id = v_id;
		this.city = city;
	}

	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Voter [v_id=" + v_id + ", city=" + city + "]";
	}
}
