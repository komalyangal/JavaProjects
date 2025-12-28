package com.Dkte.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "komal");
			PreparedStatement selectstmt=null;
			String sql="select * from employee ";
			selectstmt=connection.prepareCall(sql);
			ResultSet rs=selectstmt.executeQuery();
			while(rs.next())
			{
				Employee e=new Employee();
				e.empid=rs.getInt(1);
				e.name=rs.getString(2);
				e.salary=rs.getDouble(3);
				e.dept=rs.getString(4);
				System.out.println(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
