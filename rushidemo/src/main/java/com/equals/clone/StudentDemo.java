package com.equals.clone;

public class StudentDemo implements Cloneable {
	int roll;
	String name;
	Address add;
	StudentDemo(){
		
	}
	public StudentDemo(int roll, String name, Address add) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
	}
	StudentDemo(int roll,String name){
		this.roll=roll;
		this.name=name;
		
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll=roll;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public boolean equals(Object obj) {        //1. Equals method override for Contain Equality
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(obj instanceof StudentDemo) {
			StudentDemo s=(StudentDemo)obj;
			return roll==s.roll && name.equals(s.name);
		}
		else 
			return false;
	}
	public int hashCode() {					//2. Override HashCode Method for Follow Equal and HashCode Contract
		return roll;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Object clone() throws CloneNotSupportedException {
		
		StudentDemo s=(StudentDemo)super.clone();
		s.setAdd((Address)s.getAdd().clone());
		
		return s;
		
	}
//public Object clone() throws CloneNotSupportedException {
//	
//	Address ad=new Address(this.getAdd().getPin(),this.getAdd().getCity());
//	StudentDemo s=new StudentDemo(this.getRoll(),this.getName(),ad);
//		return s;
//		
//	}

	@Override
public String toString() {
	return "StudentDemo [roll=" + roll + ", name=" + name + ", add=" + add + "]";
}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address ad=new Address(123,"kop");
		StudentDemo s1=new StudentDemo(10,"Ram",ad);
		StudentDemo s2=new StudentDemo(10,"Ram");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StudentDemo s3=(StudentDemo)s1.clone();
		
		System.out.println(s1);
		System.out.println(s3);
		s1.getAdd().setCity("pune");
		System.out.println(s1);
		System.out.println(s3);
		
		
		
		
		
		
		
	}

}
