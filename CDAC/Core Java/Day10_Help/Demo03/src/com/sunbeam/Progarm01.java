package com.sunbeam;

import java.util.stream.Stream;

public class Progarm01 {

	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8).filter(e -> e % 2 == 0).map(e -> e * e)
				.forEach(e -> System.out.print(e + ","));
	}

	public static void main1(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int ele : arr) {
			if (ele % 2 == 0) {
				int result = ele * ele;
				System.out.print(result + ",");
			}
		}

	}

}
