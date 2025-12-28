package com.Dkte.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program_02 {

	public static void main(String[] args) {
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "komal");
			PreparedStatement selectstmt=null;
			String sql="Insert into employee (name,salary,dept) values(? ,? ,?)";
			selectstmt=connection.prepareCall(sql);
			Employee e=new Employee();
			e.accept();
			selectstmt.setString(1,e.name);
			selectstmt.setDouble(2, e.salary);
			selectstmt.setString(3, e.dept);
			selectstmt.executeUpdate();
			System.out.println("Employee added");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

}
