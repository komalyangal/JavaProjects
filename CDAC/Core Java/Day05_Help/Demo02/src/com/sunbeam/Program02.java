package com.sunbeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program02 {

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
		} catch (ArithmeticException ex) {
			System.out.println("Division with 0 denominator is not possible");
		} catch (InputMismatchException ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Inside finally");
			sc.close();
		}
		System.out.println("Program Finished");
	}

}
