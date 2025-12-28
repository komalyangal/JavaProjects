package com.sunbeam;

import java.util.Scanner;

class Point {
	// fields
	int xaxis;
	int yaxis;

	// methods
	void acceptPoint() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter x axis - ");
		xaxis = sc.nextInt();

		System.out.print("Enter y axis - ");
		yaxis = sc.nextInt();
	}

	void displayPoint() {
		System.out.println("Point = (" + xaxis + "," + yaxis + ")");
	}
}

public class Program {

	public static void main(String[] args) {
		int n1; // variable

		Point p1; // reference
		// Variable of a class is called as reference
		// we can store the address of an object inside the reference

		p1 = new Point(); // object of point stored inside the reference
		p1.displayPoint(); // 0,0

		p1.acceptPoint();
		p1.displayPoint();
	}

}
