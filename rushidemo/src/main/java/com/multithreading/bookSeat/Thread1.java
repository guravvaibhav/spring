package com.multithreading.bookSeat;

public class Thread1 extends Thread{
	Theater t;
	int seat;
	
	public Thread1(Theater t, int seat) {
		super();
		this.t = t;
		this.seat = seat-1;
	}
	public void run() {
		t.book(seat);
	}
	

}
