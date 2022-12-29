package com.custom.srealization;

import java.io.*;

public class TestBank {

	public static void main(String[] args) throws Exception {

		Bank b1 = new Bank(1, "AAA", "Rushi", 1234);
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\Soft\\eclipse-workspace\\Seralization\\src\\main\\java\\bank.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b1);

		Bank b2 = new Bank();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Soft\\eclipse-workspace\\Seralization\\src\\main\\java\\bank.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		b2 = (Bank) ois.readObject();
		System.out.println(b2);
	}

}
