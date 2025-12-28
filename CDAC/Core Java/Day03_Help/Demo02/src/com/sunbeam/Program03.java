package com.sunbeam;

import java.util.Scanner;

//Example of Runtime Polymorphism
public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// storing the object of sub class into the super class reference
		Employee emp = new Manager(); // Upcasting
		emp.accept(sc);
		emp.display();
		// emp.getBonus(); // NOT OK -> Object Slicing
	}

}
