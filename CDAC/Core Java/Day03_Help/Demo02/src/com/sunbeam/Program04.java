package com.sunbeam;

import java.util.Scanner;

// Example of Runtime Polymorphism using menu driven code
public class Program04 {

	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Manager");
		System.out.println("2. Salesman");
		System.out.print("Enter your choice - ");
		return sc.nextInt();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Employee emp = null;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				emp = new Manager(); // upcasting
				break;
			case 2:
				emp = new Salesman(); // upcasting
				break;
			default:
				System.out.println("Wrong choice...");
				break;
			}
			if (emp != null) {
				emp.accept(sc);
				emp.display();
				emp = null;
			}
		}
	}

}
