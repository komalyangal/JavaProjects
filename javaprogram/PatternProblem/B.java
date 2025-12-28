import java.util.Scanner;
class B
{
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=sc.nextInt();
		int star=n;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=star;k++)
			{	
				if( i==n/2+1||k==1 ||k==star|| i==1 ||i==star)
					System.out.print("* ");
				else
					System.out.print(" "+" ");
			}
			
			System.out.println();
			
		}
	}
}