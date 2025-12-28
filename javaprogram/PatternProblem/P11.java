import java.util.Scanner;
class P11
{
	public static void main(String [] arge)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=sc.nextInt();
		int space=n-1;
		int star=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1;j<=star;j++)
			{
				if(j%2==0)
				{
					System.out.print("!"+" ");
				}
				else
				{
					System.out.print("*"+" ");
				}
			}
			star+=2;	
			space--;			
			System.out.println();
		}
		
	}
}
