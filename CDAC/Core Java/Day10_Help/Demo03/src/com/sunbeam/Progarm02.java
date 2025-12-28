package com.sunbeam;

import java.util.stream.Stream;

public class Progarm02 {

	public static void main(String[] args) {
		// cube the odd numbers and display in sorted order
		// only unique elements to be displayed
		Stream.of(3, 6, 1, 3, 9, 5, 7, 5, 8, 2, 7, 4).distinct().filter(e -> e % 2 != 0).sorted().map(e -> e * e * e)
				.forEach(e -> System.out.print(e + ", "));
	}

	public static void main1(String[] args) {
		// cube the odd numbers and display in sorted order
		Stream.of(3, 6, 1, 9, 5, 7, 8, 2, 4).filter(e -> e % 2 != 0).sorted().map(e -> e * e * e)
				.forEach(e -> System.out.print(e + ", "));
	}

}
