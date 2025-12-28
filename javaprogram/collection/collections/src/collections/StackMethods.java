package collections;

import java.util.*;
public class StackMethods {

	public static void main(String[] args) {
		
		Stack <Integer> s=new Stack<>();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the numbers ");
		for(int i=0;i<5;i++)
		{
			s.add(sc.nextInt());
		}
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(	s.peek());
		System.out.println("Enter the number you want to search ");
		int n=sc.nextInt();
		if(s.contains(n))
		{
			System.out.println("Element is present in stack at position "+s.indexOf(n));
		}
		else
			System.out.println("Element is not present ");
		
	}
	

}
