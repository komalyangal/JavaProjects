package com.dkte;

import java.util.Scanner;

class Point {
	
	int xaxis;
	int yaxis;

	
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

public class Program01 {

	public static void main(String[] args) {
		
		Point p1; 
		

		p1 = new Point(); 
		p1.displayPoint(); 

		p1.acceptPoint();
		p1.displayPoint();
	}

}