package com.sunbeam;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();
		emp.accept(sc);
		emp.display();

		Manager man = new Manager();
		man.accept(sc);
		man.display();

		// Test the same thing for salesman
		// TO-DO

	}

}
