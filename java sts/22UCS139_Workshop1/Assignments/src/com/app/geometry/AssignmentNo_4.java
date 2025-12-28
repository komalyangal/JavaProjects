package com.dkte;

import java.util.Scanner;
public class AssignmentNo_4 {	
		
	public AssignmentNo_4(String partNumber,int quantity,String Pdescription ,double PriceItem) 
	{
		quantity=0;
		PriceItem=0.0;
		partNumber=null;
		Pdescription=null;
	}
	public static void main(String[] args) 
	{			
		Scanner sc=new Scanner(System.in);
		int quantity = 0;
		String partNumber = null,Pdescription = null;
		double Priceitem = 0;
		AssignmentNo_4 a=new AssignmentNo_4(partNumber, quantity,Pdescription,Priceitem);

		System.out.println("Enter the part number ");
		partNumber=sc.nextLine();
		System.out.println("Enter the part description ");
		Pdescription=sc.next();
		System.out.println("Enter the Quntity ");
		quantity=sc.nextInt();
		System.out.println("Enter the price item ");
		Priceitem=sc.nextDouble();
		System.out.println("Total price "+Priceitem*quantity);
				
	}
}