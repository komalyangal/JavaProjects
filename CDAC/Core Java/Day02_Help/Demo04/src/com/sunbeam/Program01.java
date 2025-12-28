package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// using for-loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at index " + i + "=" + arr[i]);
		}

		// using for-each
		System.out.println("Using for-Each - ");
		for (int ele : arr)
			System.out.println(ele);
	}

}
