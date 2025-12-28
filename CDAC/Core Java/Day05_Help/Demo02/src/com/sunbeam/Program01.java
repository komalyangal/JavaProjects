package com.sunbeam;

public class Program01 {

	public static void division(int n, int d) {
		int result = n / d;
		System.out.println("Division - " + result);
	}

	public static void main(String[] args) {
		try {
			division(10, 0);
		} catch (ArithmeticException ex) {
			System.out.println("Division with 0 denominator is not possible");
		}
		System.out.println("Program Finished");
	}

}
