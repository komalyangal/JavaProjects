import java.util.Scanner;
 class P17
{
 	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number ");
		n=sc.nextInt();
		int space=-1;
		int star=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			for(int k=1;k<=space;k++)
			{	
				System.out.print(" "+" ");
			}
			space+=2;
			star++;
		}
	}
}