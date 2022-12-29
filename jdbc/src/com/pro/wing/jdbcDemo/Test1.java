package com.pro.wing.jdbcDemo;

import java.sql.*;

public class Test1 {
	public static final String dburl="jdbc:mysql://localhost/tcs";
	public static final String dbuserNm="root";
	public static final String dbuserPw="9497";
	public static ResultSet rs;
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection(dburl,dbuserNm,dbuserPw);
		Statement stm=conn.createStatement();
		String query ="select * from car";
		
		 rs= stm.executeQuery(query);
		while(rs.next()) {
			System.out.println("id : "+rs.getInt(1)+" car name : "+ rs.getString(2)+ " price : "+ rs.getInt(3)+" type : "+rs.getString(4));
		}
		
	}

}
