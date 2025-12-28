package com.dkte;

import java.util.Scanner;

public class AssignmentNo_1 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the number ");
			int num=sc.nextInt();
			System.out.println("Binary Number "+Integer.toBinaryString(num));
			System.out.println("Hexadecimal Number "+Integer.toHexString(num));
			System.out.println("Ocatal Number "+Integer.toOctalString(num));
		}
		catch(Exception ie)
		{
			ie.printStackTrace();
		}
	}
}
