package com.sunbeam;

import java.util.Vector;

public class Program02 {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		for (int i = 1; i <= 10; i++)
			v1.add("" + i);

		for (int i = 1; i <= 10; i++)
			v1.addElement("" + i);

		v1.addElement("A");

		System.out.println("Capacity = " + v1.capacity());
		System.out.println("Size = " + v1.size());

		// To-Do
		// Test remaining similar methods in vector.
	}

}
