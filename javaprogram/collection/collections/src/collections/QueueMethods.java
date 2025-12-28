package collections;

import java.util.Scanner;
import java.util.LinkedList;

public class QueueMethods {

	public static void main(String[] args) {
		LinkedList <Integer> q=new LinkedList<>();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the numbers ");
		for(int i=0;i<5;i++)
		{
			q.add(sc.nextInt());
		}
		System.out.println(q);
		q.poll();
		System.out.println(q);
		System.out.println(q.pollFirst());
		System.out.println(q.pollLast());
		System.out.println(q);
	}

}
