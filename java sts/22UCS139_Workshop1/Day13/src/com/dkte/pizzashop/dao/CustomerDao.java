package com.dkte.pizzashop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dkte.pizzashop.entites.Customer;
import com.dkte.pizzashop.utils.DB_util;

public class CustomerDao implements AutoCloseable{
	
	Connection connection;
	public CustomerDao() throws SQLException {
		connection=DB_util.getConnection();
	}
	
	public void insertCustomer(Customer customer ) throws SQLException {
		String sq1="INSERT INTO customer(name,email,password,mobile) VALUES(?,?,?,?)";
		try(PreparedStatement insertstmt=connection.prepareCall(sq1))
		{
			insertstmt.setString(1, customer.getName());
			insertstmt.setString(2, customer.getEmail());
			insertstmt.setString(3, customer.getPassword());
			insertstmt.setString(4, customer.getMobile());
			insertstmt.executeUpdate();
			
		} 
	}
	
	public Customer getCustomer(String email,String password) throws SQLException {
		String sq1="SELECT * FROM customer WHERE email=? AND password=?";
		try(PreparedStatement selectStmt=connection.prepareCall(sq1))
		{
			selectStmt.setString(1, email);
			selectStmt.setString(2, password);
			ResultSet result= selectStmt.executeQuery();
			
			if(result.next())
			{
				Customer cust=new Customer();
				cust.setCid(result.getInt(1));
				cust.setName(result.getString(2));
				cust.setEmail(result.getString(3));
				cust.setPassword(result.getString(4));
				cust.setMobile(result.getString(5));
				return cust;
				
			}
		}
		return null;
	}
	
	@Override
	public void close() throws Exception {
		if(connection!=null)
			connection.close();
	}
	
}
