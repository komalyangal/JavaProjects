package com.sunbeam.p2;

import java.util.Set;
import java.util.TreeSet;

public class Program01 {

	public static void main(String[] args) {
		Set<String> s1 = new TreeSet<String>();
		s1.add("Mukesh");
		s1.add("Anil");
		s1.add("Suresh");
		s1.add("Ramesh");
		s1.add("Mukesh"); // Duplicates are not allowed
		// s1.add(null);
		// null values should not be added in TreeSet
		// otherwise you will get NullPointerException

		System.out.println("size of s1 = " + s1.size());
		for (String s : s1)
			System.out.println(s);

	}

}
