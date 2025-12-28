package com.sunbeam;

import java.util.Scanner;

public class Program04 {

	public static void division(int n, int d) {
		int result = n / d;
		System.out.println("Division - " + result);
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the numerator - ");
			int n = sc.nextInt();
			System.out.print("Enter the denominator - ");
			int d = sc.nextInt();
			division(n, d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program Finished");
	}

}
