package com.multithreading.bookSeat;

public class Theater {
	int totalSeat = 10;
	boolean []seats= new boolean[10];

//	 void book(int seat) {
//		if (totalSeat >= seat) {
//			totalSeat -= seat;
//			System.out.println(seat + " seat booked");
//		} else {
//			System.out.println(seat + " not available..");
//			System.out.println("total seats available " + totalSeat);
//		}
//	}

	void book(int seatIndex) {
		for(int i=0;i<=10;i++) {
			if(i==seatIndex&&seats[i]==false) {
			seats[i]=true;
			totalSeat-=1;
			int x=seatIndex+1;
					
			System.out.println(x+"seat booked..");
			
			System.out.println("available seats are "+totalSeat);
			}
		}
	}
	
}
