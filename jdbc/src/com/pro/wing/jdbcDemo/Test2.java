

// to create new table

package com.pro.wing.jdbcDemo;

import java.sql.*;

public class Test2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");   // step 1
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "9497"); //step 2
			
//			if(conn.isClosed())
//				System.out.println(" error");			to chect connection,path ok or not
//			else
//				System.out.println("set");
			
//			String query="create table ram(id int primary key,name varchar(20))";    
//			String insertquery="insert into ram values(110,'rahul')";
			String addquery="alter table ram modify class_id int";
			
			
			Statement stm =conn.createStatement();
			
//			stm.execute(query);									//	to create new taable
//			stm.executeUpdate(insertquery);						//	to insert data in to table
			stm.executeUpdate(addquery);						//	to insert another column in to table
			System.out.println("table created");				
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
