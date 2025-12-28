package com.Dkte;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue_program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> d=new LinkedList<Integer>();
		Deque<String> ds=new LinkedList<String>();
		d.addFirst(10);
		d.addLast(20);
		d.addFirst(40);
		
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		System.out.println(d.peek());
		
		ds.add("komal");
		ds.addFirst("shruti");
		ds.addLast("sakshi");
		for(String s:ds)
			System.out.print(s+",");
		System.out.println();
		System.out.println(ds.peekFirst());
		System.out.println(ds.pollLast());
		System.out.println(ds.pollFirst());
		System.out.println(ds.getLast());
		System.out.println(ds.getFirst());


	}

}
