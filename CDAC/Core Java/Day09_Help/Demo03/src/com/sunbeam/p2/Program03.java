package com.sunbeam.p2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Program03 {

	public static void main(String[] args) {

		class ProductPriceComparator implements Comparator<Product> {
			@Override
			public int compare(Product o1, Product o2) {
				return Double.compare(o1.price, o2.price);
			}
		}

		ProductPriceComparator priceComparator = new ProductPriceComparator();

		Set<Product> productSet = new TreeSet<Product>(priceComparator);
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
