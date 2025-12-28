class test
{
	public static void main(String [] args)
	{
		int a=Integer.parseInt(args[0]);
		String operator=args[1];
		int b=Integer.parseInt(args[2]);
		switch(args[1])
		{
			case "*":System.out.println("Multiplication is"+a*b);
		}
}
}