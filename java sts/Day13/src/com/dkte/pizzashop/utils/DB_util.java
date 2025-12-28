package com.dkte.pizzashop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_util {
	final static  String URL="jdbc:mysql://localhost:3306/pizzastore_db";
	final static String USERNAME="root";
	final static String PASSWORD="komal";
	public static final Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
}
