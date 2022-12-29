package com.spring.collection;

import java.io.FileReader;
import java.util.Properties;
  

public class testProperties {
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("C:\\Users\\Soft\\eclipse-workspace\\spring1\\src\\main\\resources\\abc.properties");
		Properties p=new Properties();
		p.load(fr);
		System.out.println(p);
	}

}
