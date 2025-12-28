package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Progarm07 {

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

		// -> Single-liner lambda Expression
		// Lambda Expression is a shorthand implementation of Functional Interface
		Collections.sort(productList, (o1, o2) -> o1.pid - o2.pid);

		System.out.println("After Sorting ->");
		for (

		Product product : productList)
			System.out.println(product);

	}

}
