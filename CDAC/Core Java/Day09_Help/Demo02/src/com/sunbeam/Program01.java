package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date(2, 3, 2000);
		Date d2 = new Date(2, 3, 2000);

		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);

		System.out.println("d1.hashCode() = " + d1.hashCode());
		System.out.println("d2.hashCode() = " + d2.hashCode());

		System.out.println("d1.equals(d2) = " + d1.equals(d2));
	}

}
