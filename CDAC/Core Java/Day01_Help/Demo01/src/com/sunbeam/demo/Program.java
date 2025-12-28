package com.sunbeam.demo;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		String name;
		int age;
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name - ");
		name = sc.next();
		System.out.print("Enter the age - ");
		age = sc.nextInt();
		System.out.println(name + " - " + age);

	}
}
