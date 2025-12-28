package com.dkte.pizzashop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dkte.pizzashop.entites.Pizza;
import com.dkte.pizzashop.utils.DB_util;

public class OrderDao implements AutoCloseable {
	Connection connection;

	public OrderDao() throws SQLException {
		connection = DB_util.getConnection();
	}

	public void placeOrder(int mid, int cid) throws SQLException {
		String sq1 = "INSERT INTO orders(cid,mid) VALUES(?,?)";
		try (PreparedStatement insertStmt = connection.prepareCall(sq1)) {
			insertStmt.setInt(1, cid);
			insertStmt.setInt(2, mid);
			insertStmt.executeUpdate();
		}
	}

	public List<Pizza> getAllOrders(int cid) throws SQLException {
		List<Pizza> pizzaList = new ArrayList<Pizza>();
		String sq1 = "SELECT m.* FROM menu m INNER JOIN orders o ON m.mid=o.mid WHERE o.cid=?";
		try (PreparedStatement select = connection.prepareCall(sq1)) {
			select.setInt(1, cid);
			ResultSet result = select.executeQuery();
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
