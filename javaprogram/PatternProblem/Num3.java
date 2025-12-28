import java.util.Scanner;
 class Num3
{
 	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number ");
		n=sc.nextInt();
		int num;
		int star=1;
		for(int i=1;i<=n;i++)
		{
			num=n;		
			for(int j=n;j>=star;j--)
			{			
				System.out.print((num--)+" ");	
			}
			System.out.println();

		}
	}
}