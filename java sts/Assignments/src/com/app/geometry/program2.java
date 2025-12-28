package com.dkte;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class program2 {

	public static int menu(Scanner sc) {
		System.out.println("***************************");
		System.out.println("0.Exit");
		System.out.println("1.To accept book details ");
		System.out.println("2.To display book details");
		System.out.println("3.To Sorting according to category ");
		System.out.println("4.To Sorting according to author name ");
		System.out.println("5.To find book ");
		System.out.println("***************************");

		System.out.println("Enter your chioce ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		Books b1;
		HashSet<Books> bookSet=new HashSet<Books>();
		
//		String isbn;
//		String category;
//		double price;
//		String authorName;
//		int quantity;
		
		while((choice=menu(sc))!=0)
		{
			switch (choice) {
			case 1:
				b1=new Books();
				b1.accept(sc);
				bookSet.add(b1);
				
//				System.out.println("Enter book id ");
//				isbn=sc.next();
//				System.out.println("Enter book category");
//				category=sc.next();
//				System.out.println("Enter book price");
//				price=sc.nextDouble();
//				System.out.println("Enter book author name");
//				authorName=sc.next();
//				System.out.println("Enter book quantity");
//				quantity=sc.nextInt();
//				bookSet.add(new Books(isbn, category, price, authorName, quantity));
//				
				
				break;

			case 2:
				for(Books ele:bookSet)
				{
					System.out.println(ele);
				}
				break;
			case 3:
				ArrayList<Books> bookList=new ArrayList<Books>(bookSet);
				
				Collections.sort(bookList,(o1,o2)->o1.category.compareTo(o2.category));
				System.out.println("After sorting according to category - ");
				bookList.forEach(ele->System.out.println(ele));
				
				break;
			case 4:
					ArrayList<Books> book=new ArrayList<Books>(bookSet);
					
					Collections.sort(book,(o1,o2)->o1.authorName.compareTo(o2.authorName));
					System.out.println("After sorting according to authorName - ");
					book.forEach(ele->System.out.println(ele));
					
				break;
			case 5:
					
					break;
			default:
				
			}
		}
	}

}
