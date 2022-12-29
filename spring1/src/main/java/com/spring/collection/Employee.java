package com.spring.collection;

import java.util.Properties;

public class Employee {
	Properties p;

	public Employee() {
		super();
	}
  
	public Employee(Properties p) {
		super();
		this.p = p;
	}

	public Properties getP() {
		return p;
	}

	public void setP(Properties p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Employee [p=" + p + "]";
	}
	

}
