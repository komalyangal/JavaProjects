package com.sunbeam.p6;

public class Program {
	public static <T> void displayArray(T[] arr) {
		for (T element : arr)
			System.out.println("Element = " + element);
	}

	public static void main(String[] args) {
		// Integer[] arr1 = new Integer[] { 10, 20, 30, 40, 50 };
		Integer[] arr1 = { 10, 20, 30, 40, 50 };
		displayArray(arr1);

		Double[] arr2 = { 11.22, 22.33, 33.44, 44.55, 55.66 };
		displayArray(arr2);

		String[] arr3 = { "Anil", "Mukesh", "Ramesh", "Suresh", "Ram", "Sham" };
		displayArray(arr3);
	}

}
