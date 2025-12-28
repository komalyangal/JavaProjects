import mypack.*;
import java.util.Scanner;
class Exppackage
{
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		Arithmetic a=new Arithmetic();
		System.out.println("Enter the first number ");
		int num1=sc.nextInt();
		System.out.println("Enter the Second number ");
		int num2=sc.nextInt();
		System.out.println("Addition of two number is "+a.add(num1,num2));
		System.out.println("Substraction of two number is "+a.sub(num1,num2));
		System.out.println("Multiplication of two number is "+a.mul(num1,num2));
		try 
		{
			System.out.println("Divison of two number is "+a.div(num1,num2));
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Error message is "+ae.getMessage());
		}

		
		Trigonometry t=new Trigonometry();
		System.out.println("\nEnter the angle in degree ");
		double angle=sc.nextDouble();

		System.out.println("Radian value is "+t.radianValue(angle));
		System.out.println("Sin value is "+t.sinValue());
		System.out.println("Cos value is "+t.cosValue());
		System.out.println("Tan  value is "+t.tanValue());
		System.out.println("Sec value is "+t.secValue());
		System.out.println("Cot value is "+t.cotValue());
		System.out.println("Cosec value is "+t. cosecValue());
		
		Statistics s= new Statistics();
		System.out.println("\nEnter the data ");
		int []data=new int[5];
		for(int i=0;i<5;i++)
		{
			data[i]=sc.nextInt();
		}
		System.out.println("Mean of the data is "+s. calculateMean(data));
		System.out.println("Median of the data is "+s. calculateMedian(data));
		System.out.println("Mode of the data is "+ s. calculateMode(data));
		System.out.println("Standard Deviation of data is "+s. calStandardDeviation(data));

		
	}
}