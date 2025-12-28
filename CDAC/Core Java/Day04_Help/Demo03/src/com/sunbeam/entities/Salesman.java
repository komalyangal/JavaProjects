package com.sunbeam.entities;

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
	public String toString() {
		return "Salesman [noOfSales=" + noOfSales + ", commission=" + commission + ", toString()=" + super.toString()
				+ "]";
	}

}
