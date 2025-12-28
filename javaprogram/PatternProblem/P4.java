import java.util.Scanner;
class P4
{
	public static void main(String [] arg)
	{
		int n;
		System.out.println("Enter the row and column ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int space=n-2;
		//col=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i==1 || i==n)
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print("* ");	
				}	
			}
				
			else
			{
				System.out.print("* ");

				for(int j=1;j<=space;j++)
				{
					System.out.print(" "+" ");
				}
				System.out.print("* ");
			}
			System.out.println();		
			
		}
	}
}