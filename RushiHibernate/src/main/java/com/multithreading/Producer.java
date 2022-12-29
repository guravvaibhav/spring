package com.multithreading;

public class Producer extends Thread {

	Dmart d;
	static int product;

	public Producer(Dmart d) {
		super();
		this.d = d;
	}

	public void run() {
		synchronized (this) {

			for (int i = 0; i < 5; i++)
				product = i + product;
			System.out.println("Produced...." + product);
			notify();
		}

	}

}
