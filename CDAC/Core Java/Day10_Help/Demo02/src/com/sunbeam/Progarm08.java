package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Progarm08 {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(2, "Pen", 15));
		productList.add(new Product(4, "Sharpner", 5));
		productList.add(new Product(5, "Eraser", 5));
		productList.add(new Product(1, "Notebook", 50));
		productList.add(new Product(3, "Pencil", 10));

		System.out.println("Before Sorting ->");
		productList.forEach(p -> System.out.println(p));

		Collections.sort(productList, (o1, o2) -> o1.name.compareTo(o2.name));

		System.out.println("After Sorting ->");
		productList.forEach(p -> System.out.println(p));

	}

}
