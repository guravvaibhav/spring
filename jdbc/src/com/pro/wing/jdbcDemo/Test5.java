package com.pro.wing.jdbcDemo;

import java.sql.*;

public class Test5 {
	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection co=DriverManager.getConnection("jdbc:mysql://localhost/tcs", "root", "9497");
	
	Statement s=co.createStatement();
	
	String query="insert into car values(6,'bugati',86867,'petrol')";
	
	int r=s.executeUpdate(query);
	System.out.println(r);
	
	
	}

}
