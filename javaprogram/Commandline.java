class Commandline
{
	public static void main(String [] args)
	{
		int num1,num2;
	
		String text1=args[0];
		String text2=args[1];
		num1=Integer.parseInt(text1);
		num2=Integer.parseInt(text2);
		int add=num1+num2;
		System.out.println("addition is "+add);
	}
}