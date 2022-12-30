package com.methodInjection;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class Showroom{
	int id;
	Car car;
	public Showroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Showroom(int id, Car car) {
		super();
		this.id = id;
		this.car = car;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Showroom [id=" + id + ", car=" + car + "]";
	}
	 
	 public abstract Car getCarBean();
	

}
