package com.dkte.pizzashop.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.dkte.pizzashop.dao.CustomerDao;
import com.dkte.pizzashop.entites.Customer;

public class MainMenu {

	public static int menu(Scanner sc){
		System.out.println("***Welcome to Pizza Store***");
		System.out.println("0.exit");
		System.out.println("1.Login");
		System.out.println("2.Register");
		System.out.println("****************************");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		return choice;
	}
	
	public static Customer loginCustomer(Scanner sc) {
		System.out.println("Enter customer  email : ");
		String email=sc.next();
		System.out.println("Enter customer password ");
		String password=sc.next();
		
		try(CustomerDao customerDao=new CustomerDao())
		{
			return customerDao.getCustomer(email, password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void registerCustomer(Scanner sc) {
		Customer cust=new Customer();
		cust.acceptCustomer(sc);
		try(CustomerDao customerDao=new CustomerDao())
		{
			customerDao.insertCustomer(cust);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		
		while((choice=menu(sc))!=0)
		{
			switch (choice) {
			case 1:
				Customer cust=loginCustomer(sc);
				if(cust!=null)
				{
					System.out.println("Login Successfully.......:)");
					SubMenu.subMenu(sc, cust);
				}
				else
					System.out.println("Invalid Credential..........");
				
				break;
			case 2:
				registerCustomer(sc);
				System.out.println("Register Successfully");

				break;
			default:
				System.out.println("Wrong choice.............");
				break;
			}
		}
		System.out.println("Thank you for using this application..........");
	}

}
