package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// select 
public class Program01 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement selectStmt = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dkte_db", "root", "root");
			String sql = "SELECT * FROM employees";
			selectStmt = connection.prepareCall(sql);
			ResultSet rs = selectStmt.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.empid = rs.getInt(1);
				e.name = rs.getString(2);
				e.salary = rs.getDouble(3);
				e.dept = rs.getString(4);
				System.out.println(e);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				selectStmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
