package com.spring.autowiring;

public class Person {
	int pId;
	Address address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pId, Address address) {
		super();
		this.pId = pId;
		this.address = address;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", address=" + address + "]";
	}
	
	

}
