package com.prowings.hibernate.inheritance.Table_class;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Employee extends Person{
	private String dept;
	private long sal;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	

}
