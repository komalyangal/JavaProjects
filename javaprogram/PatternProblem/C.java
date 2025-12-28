import java.util.Scanner;
class C
{
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=sc.nextInt();
		int star=n;
		int space=1;
		for(int i=1;i<=n;i++)
		{
			if(i==1 || i==n)
			{
				for(int j=1;j<=space;j++)
				{
					System.out.print(" "+" ");
				}
			}
			for(int k=1;k<=star;k++)
			{	
				if(k==1 || i==1 ||i==n)
					System.out.print("* ");
				else
					System.out.print(" "+" ");
			}
			
			System.out.println();
			
		}
	}
}