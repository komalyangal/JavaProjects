package java_exception;

import java.util.*;

public class RandomNumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int m=sc.nextInt();
		boolean found=false;
		while(!found)
		{
			System.out.println("Enter the number between 1 to 100");
			n=r.nextInt(100)+1;
			if(n==m) {
				System.out.println("match number ");
				found=true;
			}
			else
				System.out.println("please try again ");
		}
		
		
	}

}
