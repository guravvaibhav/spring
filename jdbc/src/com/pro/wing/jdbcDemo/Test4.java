package com.pro.wing.jdbcDemo;

import java.sql.*;

public class Test4 {
	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");													// register Driver class
	
	Connection co=DriverManager.getConnection("jdbc:mysql://localhost/tcs", "root", "9497");	// create connection
//															url				userNM  password
	Statement s=co.createStatement();															// create statement object
	
	String query="select * from car";
	
	ResultSet r=s.executeQuery(query);															// execute query
			
	while(r.next()) {
		System.out.println(r.getInt(1)+" -- "+r.getString(2)+" -- "+r.getInt(3)+" -- "+r.getString(4));
		
	}
	co.close();																					// close connection
	}

}
