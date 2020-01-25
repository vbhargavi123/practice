package com.cts.training.Jdbcapp;

import java.sql.*;

public class Myapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1. Load driver in memory
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2. Set up a connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
			
			// 3. Create a statement
			Statement stmt = conn.createStatement();
			 
			// insert a record
			String  query = "insert into employee set name='sai',id='50'";
			int n = stmt.executeUpdate(query);
			System.out.println("Rows Added : " + n);
			
			
			ResultSet rs =  stmt.executeQuery("select * from employee");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+ "|"+ rs.getString(2)+ "|"+rs.getString(3));;
			}
			
			rs.close();
			conn.close();
			
			
			/*ResultSet rs = stmt.executeQuery(""); // Retrieval  : select

			if(rs.next()) {
				rs.getString(1);  // 1 based indexing
				rs.getString("email");
			}
			
			while(rs.next()) {
				
			}
			
			int n = stmt.executeUpdate(""); // DMQ/DML : insert,update,delete
			// n : number of rows affected
			 
			 */
		}
		catch(Exception ex) {
			System.out.println(ex);
			
		}
	}

}
