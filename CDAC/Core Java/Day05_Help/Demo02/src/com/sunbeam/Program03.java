package com.sunbeam;

import java.util.Scanner;

public class Program03 {

	public static void division(int n, int d) {
		int result = n / d;
		System.out.println("Division - " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the numerator - ");
			int n = sc.nextInt();
			System.out.print("Enter the denominator - ");
			int d = sc.nextInt();
			division(n, d);
		} catch (Exception e) // Generic Catch Block
		{
			e.printStackTrace();
		} finally {
			System.out.println("Inside finally");
			sc.close();
		}
		System.out.println("Program Finished");
	}

}
