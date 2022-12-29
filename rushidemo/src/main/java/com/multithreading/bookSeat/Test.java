package com.multithreading.bookSeat;

public class Test {
	public static void main(String[] args) {
		Theater t=new Theater();
		Thread1 t1=new Thread1(t, 5);
		Thread2 t2=new Thread2(t, 4);
		t1.start();
		t2.start();
	}

}
