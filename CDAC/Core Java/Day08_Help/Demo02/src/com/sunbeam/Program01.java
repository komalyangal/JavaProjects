package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;

public class Program01 {

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.add(10);
		q1.add(20);
		q1.offer(30);

		System.out.println("Element at front = " + q1.element());
		q1.remove();
		q1.remove();
		q1.remove();
		q1.poll();
		// System.out.println("After remove,Element at front = " + q1.element());
		System.out.println("After remove,Element at front = " + q1.peek());
	}

}
