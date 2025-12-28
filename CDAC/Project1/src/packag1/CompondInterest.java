package packag1;

import java.util.Scanner;

public class CompondInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		check c1=new check();
		System.out.println("Enter the Principal amount");
		int p=sc.nextInt();
		System.out.println("Enter the no.of years");
		int t=sc.nextInt();
		System.out.println("Enter the rate");
		int r=sc.nextInt();
		
		float a= (float) (p*(Math.pow((1+(r/100.0)),t)));
		System.out.println("Compound Interest "+(a-p));
	}

}
