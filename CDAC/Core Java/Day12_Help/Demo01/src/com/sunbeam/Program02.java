package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program02 {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/dkte_db";
		final String USERNAME = "root";
		final String PASSWORD = "root";

		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			String sql = "INSERT INTO employees(name,salary,dept) VALUES(?,?,?)";
			try (PreparedStatement insertStmt = connection.prepareCall(sql)) {
				Employee e = new Employee();
				e.accept();
				insertStmt.setString(1, e.name);
				insertStmt.setDouble(2, e.salary);
				insertStmt.setString(3, e.dept);
				insertStmt.executeUpdate();
				System.out.println("Employee added");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
