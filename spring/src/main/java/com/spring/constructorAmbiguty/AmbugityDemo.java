package com.spring.constructorAmbiguty;

public class AmbugityDemo {
	int i;
	int j;
	
	public AmbugityDemo(int i, int j) {
		super();
		System.out.println("int int");
		this.i = i;
		this.j = j;
	}
	public AmbugityDemo(String i, int j) {
		super();
		System.out.println("String int");
		this.i = Integer.parseInt(i);
		this.j = j;
	}
	public AmbugityDemo(double i, int j) {
		super();
		System.out.println("double int");
		this.i = (int)i;
		this.j = j;
	}
	
//	public AmbugityDemo(String i, String j) {
//		super();
//		System.out.println("String String");
//		this.i = Integer.parseInt(i);
//		this.j = Integer.parseInt(j);
//	}
	@Override
	public String toString() {
		return "AmbugityDemo [i=" + i + ", j=" + j + "]";
	}
	
	

}
