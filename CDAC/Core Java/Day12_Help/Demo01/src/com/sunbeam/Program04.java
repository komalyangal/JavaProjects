package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/dkte_db";
		final String USERNAME = "root";
		final String PASSWORD = "root";

		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			String sql = "DELETE FROM employees WHERE empid = ?";
			try (PreparedStatement updateStmt = connection.prepareCall(sql)) {

				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the empid - ");
				int empid = sc.nextInt();

				updateStmt.setInt(1, empid);
				updateStmt.executeUpdate();
				System.out.println("Employee Deleted");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
