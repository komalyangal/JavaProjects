package com.sunbeam;

import java.util.HashSet;
import java.util.Set;

public class Progarm03 {

	public static void main(String[] args) {
		Set<Product> productList = new HashSet<Product>();
		productList.add(new Product(2, "Pen", 15));
		productList.add(new Product(4, "Sharpner", 5));
		productList.add(new Product(5, "Eraser", 5));
		productList.add(new Product(1, "Notebook", 50));
		productList.add(new Product(3, "Pencil", 10));

		System.out.println("Before Sorting ->");
		productList.forEach(e -> System.out.println(e));

		System.out.println("After Sorting on names ->");
		productList.stream().sorted((p1, p2) -> p1.name.compareTo(p2.name)).forEach(e -> System.out.println(e));

		System.out.println("After Sorting on price in desc ->");
		productList.stream().sorted((p1, p2) -> Double.compare(p2.price, p1.price)).forEach(e -> System.out.println(e));
	}

}
