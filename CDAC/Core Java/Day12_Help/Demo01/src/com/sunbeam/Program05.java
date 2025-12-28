package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Program05 {

	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Add Employee");
		System.out.println("2. Display All Employees");
		System.out.println("3. Update Employee Salary");
		System.out.println("4. Delete Employee");
		System.out.println("Enter your choice - ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String URL = "jdbc:mysql://localhost:3306/dkte_db";
		final String USERNAME = "root";
		final String PASSWORD = "root";

		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
