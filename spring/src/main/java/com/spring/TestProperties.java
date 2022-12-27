package com.spring;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		FileReader fr=new FileReader("C:\\Users\\Soft\\eclipse-workspace\\spring\\src\\main\\resources\\emp.properties");
		p.load(fr);
		System.out.println(p);

	}

}
