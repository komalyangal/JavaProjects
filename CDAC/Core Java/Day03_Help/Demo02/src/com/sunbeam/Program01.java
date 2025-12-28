package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Salesman Details...");
		Salesman s1 = new Salesman();
		s1.accept(sc);
		s1.display();
	}

	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Manager Details...");
		Manager m1 = new Manager();
		m1.accept(sc);
		m1.display();
	}

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee Details...");
		Employee e1 = new Employee();
		e1.accept(sc);
		e1.display();
	}

}
