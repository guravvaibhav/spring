package hibernate.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int std_id;
	private String name;
	public Student(int std_id, String name) {
		super();
		this.std_id = std_id;
		this.name = name;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", name=" + name + "]";
	}
	
	

}
