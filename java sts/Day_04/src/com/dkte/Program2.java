package com.dkte;


public class Program2 {

	public static void main(String[] args) {
		Date d1 = new Date(1, 1, 2000);
		Date d2 = new Date(1, 1, 2000);

		if (d1 == d2)
			System.out.println("Dates are equal");
		else
			System.out.println("Dates are not equal");

	}

	public static void main1(String[] args) {
		Date d1 = new Date(1, 1, 2000);
		Date d2 = d1;

		if (d1 == d2)
			System.out.println("Dates are equal");
		else
			System.out.println("Dates are not equal");

	}

}
