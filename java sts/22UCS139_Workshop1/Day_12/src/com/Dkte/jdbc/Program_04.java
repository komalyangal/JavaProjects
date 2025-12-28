package com.Dkte.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program_04 {

	public static void main(String[] args) {
		final String url="jdbc:mysql://localhost:3306/employee";
		final String username="root";
		final String password="komal";
		Scanner sc=new Scanner(System.in);
		try(Connection connection=DriverManager.getConnection(url, username, password))
		{
			String sql="update employee set salary=? where empid=?";
			try(PreparedStatement updatestmt=connection.prepareCall(sql))
			{
				
			
				System.out.println("Enter the new salary ");
				double salary=sc.nextDouble();
				System.out.println("Enter the empid ");
				int empid=sc.nextInt();
				updatestmt.setDouble(1,salary );
				updatestmt.setInt(2, empid);
				updatestmt.executeUpdate();
				System.out.println("Employee update ");
			}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}

}
