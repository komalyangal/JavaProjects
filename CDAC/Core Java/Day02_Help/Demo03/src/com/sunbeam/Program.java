package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static int menu(Scanner sc) {
		System.out.println("********************");
		System.out.println("0. EXIT");
		System.out.println("1. ADD EMPLOYEE");
		System.out.println("2. DISPLAY EMPLOYEE");
		System.out.println("3. CALCULATE TAX");
		System.out.println("********************");
		System.out.print("Enter your choice - ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Employee e1 = new Employee();
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				e1.accept(sc);
				break;
			case 2:
				e1.display();
				break;
			case 3:
				e1.calculateTax();
				break;
			default:
				System.out.println("Wrong choice...:(");
				break;
			}
		}
	}

}
