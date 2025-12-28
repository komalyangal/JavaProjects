package packag1;
import java.util.Scanner;

class check
{
	void findLargest(int a,int b,int c)
	{
		if(a>b) 
		{
			if(a>c)
				System.out.println("Largest number is "+a);
			else
				System.out.println("largest is "+c);
		}
		else if(b>c)
			
			System.out.println("Largest number is "+b);
		else
			System.out.println("Largest number is "+c);
	}		
}
public class LargestNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		check c1=new check();
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		c1.findLargest(a,b,c);
	}
}
