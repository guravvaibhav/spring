package hibernate.inheritance.TABLE_PER_CLASS;

import javax.persistence.Entity;

@Entity
public class Student extends Person{
	int roll;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	

}
