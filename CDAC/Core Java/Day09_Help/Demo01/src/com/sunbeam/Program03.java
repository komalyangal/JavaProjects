package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program03 {

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

		class ProductPriceComparator implements Comparator<Product> {
			@Override
			public int compare(Product o1, Product o2) {
				return Double.compare(o2.price, o1.price);
			}
		}
		ProductPriceComparator productPriceComparator = new ProductPriceComparator();

		Collections.sort(productList, productPriceComparator);
		System.out.println();

		System.out.println("After Sorting ->");
		for (Product product : productList)
			System.out.println(product);

	}

}
