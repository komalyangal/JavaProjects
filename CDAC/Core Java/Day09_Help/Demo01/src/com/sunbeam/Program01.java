package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(40);
		l1.add(10);
		l1.add(20);
		l1.add(30);

		for (Integer ele : l1)
			System.out.print(ele + ", ");

		System.out.println();
		Collections.sort(l1);

		System.out.println("After sorting");
		for (Integer ele : l1)
			System.out.print(ele + ", ");
	}

}
