import java.util.Scanner;
class P7
{
	public static void main(String [] arg)
	{
		int n;
		System.out.println("Enter the size ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int space=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			space--;
			System.out.print("\n");
			
		}
	}
}