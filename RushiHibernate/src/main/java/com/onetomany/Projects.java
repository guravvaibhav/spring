package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Projects {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sr;
	
	@Override
	public String toString() {
		return "Projects [sr=" + sr + ", proid=" + proid + ", proname=" + proname + ", probudget=" + probudget
				+ ", emp=" + emp + "]";
	}
	private int proid;
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getProbudget() {
		return probudget;
	}
	public void setProbudget(int probudget) {
		this.probudget = probudget;
	}
	public Projects(int proid, String proname, int probudget, Emp emp) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.probudget = probudget;
		this.emp = emp;
	}
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String proname;
	private int probudget;
	@ManyToOne
	private Emp emp;
	

}
