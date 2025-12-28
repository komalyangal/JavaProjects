package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program02 {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(2, "Pen", 10));
		productList.add(new Product(5, "Eraser", 5));
		productList.add(new Product(3, "Pencil", 5));
		productList.add(new Product(4, "Sharpner", 15));
		productList.add(new Product(1, "NoteBook", 50));

		System.out.println("Before Sorting->");
		for (Product product : productList)
			System.out.println(product);

		Collections.sort(productList);
		System.out.println();

		System.out.println("After Sorting ->");
		for (Product product : productList)
			System.out.println(product);

	}

}
