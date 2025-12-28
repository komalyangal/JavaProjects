package com.dkte;


public class Program3 {

	public static void main(String[] args) {
		Date d1 = new Date(1, 1, 2000);
		Date d2 = new Date(1, 1, 2000);
		Date d3 = new Date(1, 1, 2000);

		if (d1.equals(d3))
			System.out.println("Dates are equal");
		else
			System.out.println("Dates are not equal");

	}

}
