package com.pro.wings.practice;

import java.sql.*;

public class Test2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/collage", "root", "9497");
			String query="update student set phone_no=? where roll=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setLong(1,7743548289l);
			pstmt.setInt(2,107);
			System.out.println(pstmt.executeUpdate());
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
		
	}

}
