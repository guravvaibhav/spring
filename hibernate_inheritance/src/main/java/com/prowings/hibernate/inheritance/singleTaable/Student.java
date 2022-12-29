package com.prowings.hibernate.inheritance.singleTaable;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("s")
public class Student extends Person{
private int roll;
private double marks;
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}


}
