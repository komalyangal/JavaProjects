package java_exception;

import java.util.Scanner;


public class Sample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		try
		{
			System.out.println("Enter a");
			a=sc.nextInt();
			System.out.println("Enter b");
			b=sc.nextInt();
			if(b!=0)
			{
				System.out.println("Division is "+a/b);
			}
		}
		catch(ArithmeticException ae)
		{
			ae.getMessage();
		}
}
}