package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Anil");
		l1.add("Ramesh");
		l1.add("Sham");

//		for (String s : l1)
//			System.out.println(s);

		l1.add("Ram");
		l1.add(1, "Mukesh");
		l1.add("Ramesh");

		// can be used only on List Interface and its subclasses
		for (int i = 0; i < l1.size(); i++)
			System.out.println("Element at index " + i + " = " + l1.get(i));

		System.out.println("Index of Ramesh = " + l1.indexOf("Ramesh"));
		System.out.println("Last Index of Ramesh = " + l1.lastIndexOf("Ramesh"));

		// l1.clear();
		System.out.println("Is list empty = " + l1.isEmpty());

		System.out.println("Element removed from index = " + l1.remove(4));
	}

}
