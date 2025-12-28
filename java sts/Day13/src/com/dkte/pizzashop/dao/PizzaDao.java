package com.dkte.pizzashop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dkte.pizzashop.entites.Pizza;
import com.dkte.pizzashop.utils.DB_util;

public class PizzaDao implements AutoCloseable {
	Connection connection;

	public PizzaDao() throws SQLException {
		connection = DB_util.getConnection();
	}

	public List<Pizza> getAllPizza() throws SQLException {
		List<Pizza> pizzaList = new ArrayList<Pizza>();
		String sq1 = "SELECT * FROM menu";
		try (PreparedStatement selectstmt = connection.prepareCall(sq1)) {
			ResultSet result = selectstmt.executeQuery();
			while (result.next()) {
				Pizza pizza = new Pizza();
				pizza.setMid(result.getInt(1));
				pizza.setName(result.getString(2));
				pizza.setDescription(result.getString(3));
				pizza.setPrice(result.getDouble(4));

				pizzaList.add(pizza);
			}
		}
		return pizzaList;
	}

	@Override
	public void close() throws Exception {
		if (connection != null)
			connection.close();
	}
}
