package com.multiple.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;

public class Test {

	public static void main(String[] args) throws Exception {

		Student s1 = new Student(10, "AAA");
		Employee e1 = new Employee(101, "Shree");
		Address ad1 = new Address(123, "kop");

		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\Soft\\eclipse-workspace\\rushidemo\\src\\main\\java\\Test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.writeObject(e1);
		oos.writeObject(ad1);

		Student s2 = new Student();
		Employee e2 = new Employee();
		Address ad2 = new Address();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Soft\\eclipse-workspace\\rushidemo\\src\\main\\java\\Test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		int i = 0;
		while (ois.available() == 0 && i < 3) {
			i++;
			Object o = ois.readObject();

			if (o instanceof Student)
				s2 = (Student) o;
			if (o instanceof Employee)
				e2 = (Employee) o;
			if (o instanceof Address)
				ad2 = (Address) o;

		}

		System.out.println(s2);
		System.out.println(e2);
		System.out.println(ad2);
	}

}
