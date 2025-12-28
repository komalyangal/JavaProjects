package com.sunbeam.pizzashop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sunbeam.pizzashop.entities.Customer;
import com.sunbeam.pizzashop.utils.DBUtil;

public class CustomerDao implements AutoCloseable {

	private Connection connection;

	public CustomerDao() throws SQLException {
		connection = DBUtil.getConnection();
	}

	public void insertCustomer(Customer customer) throws SQLException {
		String sql = "INSERT INTO customer(name,email,password,mobile) VALUES(?,?,?,?)";
		try (PreparedStatement insertStatement = connection.prepareCall(sql)) {
			insertStatement.setString(1, customer.getName());
			insertStatement.setString(2, customer.getEmail());
			insertStatement.setString(3, customer.getPassword());
			insertStatement.setString(4, customer.getMobile());
			insertStatement.executeUpdate();
		}
	}


	@Override
	public void close() throws SQLException {
		if (connection != null)
			connection.close();
	}

}
