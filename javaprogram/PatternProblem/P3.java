import java.util.Scanner;
class P3
{
	public static void main(String [] arg)
	{
		int n;
		System.out.println("Enter the row and column ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int space=n-1;
		//col=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=space;j<n;j++)
			{
				System.out.print(" "+" ");	
			}
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("*"+" ");
			}
			space--;
			System.out.print("\n");	
		}

	}
}