package com.clone.deep;

public class Employee implements Cloneable {
	int id;
	String name;
	Dept dept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		Dept d=new Dept(getDept().getDeptid(),getDept().getDeptName());
//		Employee e=new Employee(getId(),getName(),d);
//		return e;
//	}

	protected Object clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		e.setDept((Dept) e.getDept().clone());
		return e;
	}

}
