package packag1;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int n=a;
		int r=0;
		int arm=0;
		while(n!=0)
		{
			r=n%10;
			 arm+=r*r*r;
			 n/=10;
			
		}
		if(arm==a)
		{
			System.out.println("The given Number is Armstrong Number ");
		}
		else 
			System.out.println("The given Number is not armstrong Number");

	}

}
