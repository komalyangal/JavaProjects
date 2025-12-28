package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {

	int noOfSales;
	double commission;

	public Salesman() {
	}

	public Salesman(int empid, String name, double salary, int noOfSales, double commission) {
		super(empid, name, salary);
		this.noOfSales = noOfSales;
		this.commission = commission;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);

	}

	@Override
	public void display() {
		super.display();
		System.out.println("No of products sold - " + noOfSales);
		System.out.println("Commission per product - " + commission);
	}

	public void calculateTotalCommission() {
		System.out.println("Total Commission = " + (noOfSales * commission));
	}

}
