package com.Dkte;

import java.util.ArrayDeque;

public class ArrayDequeue_program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> a=new ArrayDeque<Integer>();
		a.addFirst(10);
		a.addFirst(20);
		a.addLast(30);
		a.addFirst(40);
		for(Integer ele:a)
			System.out.print(ele+" ");
		System.out.println();
		System.out.println(a.peek());
		System.out.println(a.peekLast());

		System.out.println("remove first "+a.removeFirst());
		System.out.println("remove last "+a.removeLast());
		System.out.println();
		System.out.println("After Removing element ");
		for(Integer ele:a)
			System.out.print(ele+" ");
	}

}
