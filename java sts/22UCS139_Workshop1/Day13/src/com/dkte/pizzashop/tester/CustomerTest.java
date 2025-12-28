package com.dkte.pizzashop.tester;


import java.sql.SQLException;
import java.util.Scanner;

import com.dkte.pizzashop.dao.CustomerDao;
import com.dkte.pizzashop.entites.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer cust=new Customer();
		cust.acceptCustomer(sc);
		
		try(CustomerDao customerDao=new CustomerDao())
		{
			customerDao.insertCustomer(cust);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
