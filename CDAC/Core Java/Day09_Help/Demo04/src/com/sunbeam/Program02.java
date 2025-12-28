package com.sunbeam;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program02 {

	public static void main(String[] args) {
		Map<Integer, String> students = new TreeMap<Integer, String>();
		students.put(121, "Ramesh");
		students.put(132, "Anil");
		students.put(143, "Suresh");
		students.put(154, "Mukesh");
		// Duplicate keys are not allowed.
		// if added it will replace the original value of the key
		// students.put(154, "Sham");
		students.put(165, "Anil");
		// students.put(null, null); // NullPointerException
		students.put(176, null);

		System.out.println("size of students = " + students.size());

		Set<Integer> keys = students.keySet();
		for (Integer k : keys)
			System.out.print(k + ", ");
		System.out.println();

		Collection<String> values = students.values();
		for (String v : values)
			System.out.print(v + ", ");
		System.out.println();

		System.out.println("Value of 143 = " + students.get(143));
	}

}
