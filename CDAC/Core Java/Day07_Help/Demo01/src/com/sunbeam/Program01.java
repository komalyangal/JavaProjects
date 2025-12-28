package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;

public class Program01 {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		// Collection<String> c1 = new LinkedList<String>();
		// Collection<String> c1 = new LinkedHashSet<String>();

		// To add the element in the collection
		c1.add("Anil");
		c1.add("Mukesh");
		c1.add("Ramesh");
		c1.add("Suresh");
		c1.add("Mukesh");
		c1.add("Ram");

		// It checks wether the element is present in the collection or no
		System.out.println("Element present = " + c1.contains("Sham"));

		// size() return the no of elements in the collection
		System.out.println("Total  no of elements = " + c1.size());

		// It removes the given object from the collection
		System.out.println("Element removed = " + c1.remove("Mukesh"));
		System.out.println("After removing size = " + c1.size());

		// Removes all the elements from the collection
		c1.clear();
		System.out.println("Total no of elements = " + c1.size());

	}

}
