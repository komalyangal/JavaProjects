package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/dkte_db";
		final String USERNAME = "root";
		final String PASSWORD = "root";

		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			String sql = "UPDATE employees SET salary = ? WHERE empid = ?";
			try (PreparedStatement updateStmt = connection.prepareCall(sql)) {

				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the empid - ");
				int empid = sc.nextInt();
				System.out.print("Enter the new salary - ");
				double salary = sc.nextDouble();

				updateStmt.setDouble(1, salary);
				updateStmt.setInt(2, empid);
				updateStmt.executeUpdate();
				System.out.println("Employee updated");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
