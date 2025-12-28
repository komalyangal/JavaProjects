package com.Dkte.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program_03 {
	public static void main(String[] args) {
		final String url="jdbc:mysql://localhost:3306/employee";
		final String username="root";
		final String password="komal";
		Connection connection=null;
		PreparedStatement deletestmt=null;
		try {
			connection =DriverManager.getConnection(url, username, password);
			
			String sql="delete from employee where empid=?";
			deletestmt=connection.prepareCall(sql);
			System.out.println("Enter the empid ");
			Scanner sc=new Scanner(System.in);
			int empid=sc.nextInt();
			
			deletestmt.setInt(1, empid);
			deletestmt.executeUpdate();
			System.out.println("Employee Deleted");

			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				
				connection.close();
				deletestmt.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
