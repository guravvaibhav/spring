package com.multithreading;

public class TestDmart {

	public static void main(String[] args) {
		
		Dmart d=new Dmart();
		Consumer c=new Consumer(d);
		Producer p=new Producer(d);
		c.start();
		p.start();
		
	}

}
