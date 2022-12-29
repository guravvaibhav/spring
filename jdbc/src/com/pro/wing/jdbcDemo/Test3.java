package com.pro.wing.jdbcDemo;

import java.sql.*;

public class Test3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc","root", "9497");
			if(con.isClosed())
				System.out.println("done");
			else
				System.out.println("not done");
			 String query ="insert into ram values(?,?)";
			 
			 PreparedStatement stm=con.prepareStatement(query);
			 stm.setInt(1, 111);
			 stm.setString(2, "onkar");
			 
			 stm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("updated");
	}

}
