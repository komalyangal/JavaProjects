package com.dkte.pizzashop.menu;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dkte.pizzashop.dao.OrderDao;
import com.dkte.pizzashop.dao.PizzaDao;
import com.dkte.pizzashop.entites.Customer;
import com.dkte.pizzashop.entites.Pizza;

public class SubMenu {

	public static int menu(Scanner sc) {
		System.out.println("****************************");
		System.out.println("0.logout");
		System.out.println("1.Pizza menu");
		System.out.println("2.Order Pizza");
		System.out.println("3.Order history");
		System.out.println("****************************");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		return choice;
	}

	public static void displayMenu() {
		try (PizzaDao pizzaDao = new PizzaDao()) {
			List<Pizza> pizzList = pizzaDao.getAllPizza();
			pizzList.forEach(p -> System.out.println(p));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void orderPizza(Scanner sc, int cid) {
		try (OrderDao order = new OrderDao()) {
			System.out.println("Enter pizza id to place order ");
			int mid = sc.nextInt();
			order.placeOrder(mid, cid);
			System.out.println("Order Placed........:)");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void getOrder(int cid) {
		try (OrderDao order = new OrderDao()) {
			List<Pizza> pizzList = order.getAllOrders(cid);
			pizzList.forEach(p -> System.out.println(p));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void subMenu(Scanner sc, Customer cust) {
		System.out.println("Welcome " + cust.getName());
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Pizza menu");
				displayMenu();
				break;
			case 2:
				System.out.println("Order Pizza ");
				orderPizza(sc, cust.getCid());
				break;
			case 3:
				System.out.println("Order history");
				getOrder(cust.getCid());
				break;
			default:
				System.out.println("Wrong choice.............");
				break;
			}
		}
		System.out.println("Logout Successfully.........:(");
	}

}
