package com.dkte;

import java.util.Scanner;

public class AssignmentNo_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch,count=0;
		double bill=0.0;
		while(true)
		{
			System.out.println("1]Dosa		50\n2]Idli		40\n3]Samosa	15\n4]Pizza		99\n5]VadaPav	20\n6]Genrate bill\n7]Exit\nEnter your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:bill+=50;
					   count++;
						break;
				case 2:bill+=40;
						count++;
						break;
					
				case 3:bill+=150;
						count++;
						break;
				case 4:bill+=99;
						count++;
						break;
				case 5:bill+=20;
						count++;
						break;
				case 6:System.out.println("Total Quantity "+count);
						System.out.println("Total Bill is "+bill);
						System.out.println();
						break;
				case 7:System.exit(0);
						break;
						
			}
			
		
		}

	}
}
