package com.pro.wings.practice;

import java.sql.*;

public class Test4 {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/learn", "root", "9497");
		Statement stmt=con.createStatement();
		System.out.println(stmt.executeUpdate("insert into student values(1,rushi,paris,france)"));
		}
		catch(ClassNotFoundException | SQLException e) {
			
		}
	}

}
