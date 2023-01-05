package com.spring.springwithoutxml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.spring.springwithoutxml")
public class StudentConfig {

	@Bean(name = "add1")
	
	public Address getAddress1() {
		return new Address(1234, "pune");
	}

	@Bean(name = "add2")
	@Primary
	public Address getAddress2() {
		return new Address(4321, "kop");
	}
	

	@Bean(name = "prop")
	public Properties getProp() throws Exception, IOException {
	Properties p=new Properties();
	p.load(new FileReader("C:\\Users\\Soft\\git\\spring\\spring1\\src\\main\\resources\\Student.properties"));
		return p;
	}

}
