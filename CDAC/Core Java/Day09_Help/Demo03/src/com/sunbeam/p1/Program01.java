package com.sunbeam.p1;

import java.util.HashSet;
import java.util.Set;

public class Program01 {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		s1.add("Mukesh");
		s1.add("Anil");
		s1.add("Suresh");
		s1.add("Ramesh");
		s1.add("Mukesh"); // Duplicate will not be added
		s1.add(null); // null value is allowed in set
		s1.add(null); // multiple null values are not allowed

		System.out.println("size of s1 = " + s1.size());

		for (String ele : s1)
			System.out.print(ele + ", ");

	}

}
