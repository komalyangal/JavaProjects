package com.sunbeam;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Program03 {

	public static void main(String[] args) {
//		Collection<Employeee> empList = new ArrayList<Employeee>();
//		Collection<Employeee> empList = new LinkedList<Employeee>();
		Collection<Employeee> empList = new LinkedHashSet<Employeee>();
		empList.add(new Employeee(1, "Anil", 10000));
		empList.add(new Employeee(2, "Mukesh", 20000));
		empList.add(new Employeee(3, "Ramesh", 30000));
		empList.add(new Employeee(4, "Suresh", 40000));

		Employeee key = new Employeee(5);
		System.out.println("Element Present = " + empList.contains(key));

		for (Employeee employeee : empList)
			System.out.println(employeee);
	}

}
