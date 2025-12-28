import java.util.Scanner;
class D
{
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=sc.nextInt();
		int star=n;
		int space=n-2,k;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 || j==n || i==1 || i==n)
					System.out.print("* ");
       
          			  else 
              				  System.out.print("  ");

			}
			System.out.println();	
		}
	}
}