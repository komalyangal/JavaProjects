package com.dkte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AssignmentNo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		double n1,n2,avg;
		try
		{
			System.out.println("Enter the first number ");
			if((sc.hasNextDouble()))
			{
				
				n1=sc.nextDouble();
				System.out.println("Enter the Second number ");
				if(sc.hasNextDouble())
				{
					n2=sc.nextDouble();
					avg=(n1+n2)/2;
					System.out.println("Average of two numbers is "+avg);
				}
				else
				{
					System.out.println("Second number is Invalid ");
				}
				
				
			}
			else
			{
				System.out.println("First number is Invalid ");
			}
			
		}
		catch(InputMismatchException ie)
		{
			System.out.println("Invalid input ");
			
		}
		
	}

}
