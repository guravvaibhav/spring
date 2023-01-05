package fullAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
public class Student {
	@Value("23")
	int roll;
	@Value("ram")
	String name;
	@Autowired
	Address add;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int roll, String name, Address add) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}
	
}
