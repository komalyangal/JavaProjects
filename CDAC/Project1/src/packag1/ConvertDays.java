package packag1;

import java.util.Scanner;

class Convertor
{
	int y=0,w=0,d=0;
	void finddays(int n)
	{
		y=n/365;
		int rem=n%365;
		w=rem/7;
		d=rem%7;
		
	}
	void display()
	{
		System.out.println(y+"year,"+w+" Week,"+d+" Days");
		
	}
	
}
public class ConvertDays {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number");
		int a=sc.nextInt();
		Convertor c= new Convertor();
		c.finddays(a);
		c.display();

	}

}
