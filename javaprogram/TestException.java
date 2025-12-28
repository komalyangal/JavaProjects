import java.util.Scanner;
class Arithmeticop
{
	int add(int n1,int n2)throws Exception
	{
		if(n1+n2>1000)
			throw new Exception("Too Long Addition Exception ");
		else
			return n1+n2;
	}
	int sub(int n1,int n2)throws Exception
	{
		if(n1-n2<0)
			throw new Exception("Answer can not be a negative ");
		else
			return n1-n2;
	}
	
	int mul(int n1,int n2)throws Exception
	{
		if(n1*n2>5000)
			throw new Exception("Too Long Multiplication Exception ");
		else
			return n1*n2;
	}
	int div(int n1,int n2)throws Exception
	{
		if(n2==0)
			throw new Exception("Divide by zero Exception");
		else
			return n1/n2;
	}

}
class TestException
{	
	public static void main(String [] arg)
	{
		
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter the two numbers ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		Arithmeticop ae=new Arithmeticop();
		try
		{
			System.out.println("Addition of two numbers is "+ae.add(num1,num2));
		}
		catch(Exception ie)	
		{
			System.out.println("The error message "+ie.getMessage());
		}
		try
		{
			System.out.println("Substraction of two numbers is "+ae.sub(num1,num2));
		}
		catch(Exception ie)	
		{
			System.out.println("The error message "+ie.getMessage());
		}
		try
		{
			System.out.println("Multiplication of two numbers is "+ae.mul(num1,num2));
		}
		catch(Exception ie)	
		{
			System.out.println("The error message "+ie.getMessage());
		}
		try
		{
			System.out.println("Division of two numbers is "+ae.div(num1,num2));
		}
		catch(Exception ie)	
		{
			System.out.println("The error message "+ie.getMessage());
		}
		finally
		{
			sc.close();
		}

		
	}
}