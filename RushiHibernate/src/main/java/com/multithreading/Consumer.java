package com.multithreading;

public class Consumer extends Thread {
	
	Dmart d;

	public Consumer(Dmart d) {
		super();
		this.d = d;
	}
	
	public void run() {
		
		synchronized (this) {
			try {
				this.wait();
//				Thread.sleep(5000);
//				Producer p=new Producer(d);
				System.out.println("Consuming...."+Producer.product);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
