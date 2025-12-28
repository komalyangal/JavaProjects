import java.util.Scanner;
class P2
{
	public static void main(String [] arg)
	{
		int n;
		System.out.println("Enter the row and column ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int  space=n-1;
		//col=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=i-1;k++)
			{
				System.out.print("*"+" ");
			}
			space--;
			System.out.print("\n");	
		}

	}
}