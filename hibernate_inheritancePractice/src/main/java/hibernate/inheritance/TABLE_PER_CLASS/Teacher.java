package hibernate.inheritance.TABLE_PER_CLASS;

import javax.persistence.Entity;

@Entity
public class Teacher extends Person{
	int sal;

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	

}
