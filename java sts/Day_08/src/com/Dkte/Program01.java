package com.Dkte;

import java.util.LinkedList;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc=new Scanner(System.in);
		boolean ans=true;
		LinkedList<Integer> list=new LinkedList<Integer>();
		while(true)
		{
			System.out.println("*********************");
			System.out.println("0.Exit");
			System.out.println("1.List");
			System.out.println("2.Stack");
			System.out.println("3.Queue");
			System.out.println("*********************");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:while(ans)
						{
							System.out.println("Enter the data ");
							int data=sc.nextInt();
							list.add(data);
							System.out.println("You want to add data (true/false) ");
							ans=sc.nextBoolean();
						}
						System.out.println("Elements in list ");
						for(Integer ele:list)
							System.out.println(" "+ele);
						
						break;
				case 2:while(true)
						{
							System.out.println("*********************");
							System.out.println("0.Exit");	
							System.out.println("1.Push");	
							System.out.println("2.Pop");	
							System.out.println("3.Peek");	
							System.out.println("*********************");
							System.out.println("Enter your choice ");	
							int ch1=sc.nextInt();
							switch(ch1)
							{
								case 1:System.out.println("Enter the data ");
										int data=sc.nextInt();
										list.push(data);
										break;
								case 2:
										System.out.println("Poped element is "+list.pop());
										break;
								case 3:System.out.println("Peek element is "+list.peek());
										break;
								case 0:System.exit(0);
									break;
								default:break;
							}
						}
				case 3:while(true)
						{
							System.out.println("*********************");
							System.out.println("0.Exit");	
							System.out.println("1.Enqueue");	
							System.out.println("2.Dequeue");	
							System.out.println("3.Retrive");	
							System.out.println("*********************");
							System.out.println("Enter your choice ");	
							int ch2=sc.nextInt();
							switch(ch2)
							{
								case 1:System.out.println("Enter the data ");
										int data=sc.nextInt();
										list.addLast(data);
										break;
								case 2:
										System.out.println("Dequeued element "+list.pollFirst());
										break;
								case 3:System.out.println("Front element is "+list.peekFirst());
										break;
								case 0:System.exit(0);
										break;
								default:break;
							}
						}
				case 0:System.exit(0);
						break;
				default:break;
			}


		}
	}

}
