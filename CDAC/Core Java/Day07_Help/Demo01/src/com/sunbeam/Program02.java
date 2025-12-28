package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;

public class Program02 {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		// Collection<String> c1 = new LinkedList<String>();
		// Collection<String> c1 = new LinkedHashSet<String>();

		c1.add("Anil");
		c1.add("Mukesh");
		c1.add("Ramesh");
		c1.add("Suresh");
		c1.add("Mukesh");
		c1.add("Ram");

		System.out.println("Elements in the collection - ");
		for (String element : c1)
			System.out.println(element);

		System.out.println("Element removed = " + c1.remove("Mukesh"));

		System.out.println("Elements After removal - ");
		for (String element : c1)
			System.out.println(element);

	}

}
