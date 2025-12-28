package com.sunbeam;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program04 {

	public static void main(String[] args) {
		Queue<Employee> q1 = new PriorityQueue<Employee>();
		q1.add(new Employee(2, "Ramesh", 30000));
		q1.add(new Employee(3, "Sham", 55000));
		q1.add(new Employee(1, "Mukesh", 40000));
		q1.add(new Employee(4, "Anil", 50000));

		System.out.println("Removed - " + q1.remove());
		System.out.println("Removed - " + q1.remove());
	}

}
