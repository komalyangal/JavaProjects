package com.sunbeam.p2;

import java.util.Set;
import java.util.TreeSet;

public class Program02 {

	public static void main(String[] args) {
		Set<Product> productSet = new TreeSet<Product>();
		productSet.add(new Product(6, "Eraser", 5));
		productSet.add(new Product(5, "Eraser", 5));
		productSet.add(new Product(2, "Pen", 10));
		productSet.add(new Product(4, "Sharpner", 15));
		productSet.add(new Product(1, "NoteBook", 50));
		productSet.add(new Product(3, "Pencil", 5));

		System.out.println("size of productSet = " + productSet.size());

		for (Product product : productSet)
			System.out.println(product);

	}

}
