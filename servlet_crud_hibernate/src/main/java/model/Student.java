package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int roll_no;
	private String name;
	private String city;
	private double marks;
	
	public Student() {
		super();
	}

	public Student(int roll_no, String name, String city, double marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
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

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
	
	

}
