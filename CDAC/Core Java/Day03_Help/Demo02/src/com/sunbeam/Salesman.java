package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {
	int noOfSales;
	double commission;

	public Salesman() {
		// TODO Auto-generated constructor stub
	}

	public Salesman(int empid, String name, double salary, int noOfSales, double commission) {
		super(empid, name, salary);
		this.noOfSales = noOfSales;
		this.commission = commission;
	}

	@Override
	void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter the no of products sold - ");
		noOfSales = sc.nextInt();
		System.out.print("Enter the commission per sales - ");
		commission = sc.nextDouble();
	}

	@Override
	void display() {
		super.display();
		System.out.println("Salesman display");
		System.out.println("NoOfSales = " + noOfSales);
		System.out.println("Commission = " + commission);
	}

}
