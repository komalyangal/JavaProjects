package com.sunbeam;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program02 {

	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		q1.add(50);
		q1.add(60);
		q1.add(45);
		q1.add(15);

		System.out.println("Removed Element = " + q1.remove());
	}

}
