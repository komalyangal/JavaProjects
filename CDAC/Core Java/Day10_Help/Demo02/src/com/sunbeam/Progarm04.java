package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Progarm04 {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(2, "Pen", 15));
		productList.add(new Product(4, "Sharpner", 5));
		productList.add(new Product(5, "Eraser", 5));
		productList.add(new Product(1, "Notebook", 50));
		productList.add(new Product(3, "Pencil", 10));

		System.out.println("Before Sorting ->");
		for (Product product : productList)
			System.out.println(product);

		// Anonymous object of Anonymous class
		Collections.sort(productList, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				int diff = o1.pid - o2.pid;
				return diff;
			}
		});

		System.out.println("After Sorting ->");
		for (Product product : productList)
			System.out.println(product);

	}

}
