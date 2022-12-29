package com.pro.wings.practice;

import java.sql.*;

public class Test3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/learn", "root", "9497");
			String query="select * from student";
			Statement stmt=con.createStatement();
			ResultSet r=stmt.executeQuery(query);
			while(r.next()) {
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
