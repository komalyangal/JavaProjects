package com.sunbeam;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program03 {

	public static void main(String[] args) {
		Queue<String> q1 = new PriorityQueue<String>();
		q1.add("P");
		q1.add("M");
		q1.add("A");
		q1.add("D");

		System.out.println("Removed Element = " + q1.remove());
		System.out.println("Removed Element = " + q1.remove());
		System.out.println("Removed Element = " + q1.remove());
		System.out.println("Removed Element = " + q1.remove());
	}

}
