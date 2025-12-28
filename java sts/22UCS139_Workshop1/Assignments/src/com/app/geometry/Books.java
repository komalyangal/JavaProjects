package com.dkte;

import java.util.Objects;
import java.util.Scanner;

//import java.util.Scanner;

public class Books implements Comparable<Books> {
	String isbn;
	String category;
	double price;
	String authorName;
	int quantity;
	
	public Books() {
	}

	public Books(String isbn, String category, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.category = category;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter book id ");
		isbn=sc.next();
		System.out.println("Enter book category");
		category=sc.next();
		System.out.println("Enter book price");
		price=sc.nextDouble();
		System.out.println("Enter book author name");
		authorName=sc.next();
		System.out.println("Enter book quantity");
		quantity=sc.nextInt();
	}

	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", category=" + category + ", price=" + price + ", authorName=" + authorName
				+ ", quantity=" + quantity + "]";
	}

	public void display() {
		System.out.println("Book details - ");
		System.out.print("ISBN = "+isbn);
		System.out.print("Category = "+category);
		System.out.print("Price = "+price);
		System.out.println("Author Name = "+authorName);
		System.out.print("Quantity = "+quantity);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public int compareTo(Books o) {
		return this.category.compareTo(o.category);
	}
	
}
