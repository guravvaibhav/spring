package com.pro.wings.practice;

import java.sql.*;

public class Test1{
	public static final String url="jdbc:mysql://localhost/collage";
	public static final String user="root";
	public static final String passward="9497";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, passward);
			String query="select * from student";
			Statement stmt=con.createStatement();
			ResultSet r=stmt.executeQuery(query);
			while(r.next()) {
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getFloat(3)+" "+r.getString(4)+" "+r.getInt(5)+" "+r.getString(6)+" "+r.getLong(7));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	

}
