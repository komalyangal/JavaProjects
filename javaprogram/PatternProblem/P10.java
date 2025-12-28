import java.util.Scanner;
class P10
{
	public static void main(String [] arge)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=sc.nextInt();
		int space=n-1;
		//int star2=n/2;
		int star1=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=star1;j>=1;j--)
			{
				System.out.print("* ");
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print("  ");
			}
			for(int l=star1;l>=1;l--)
			{
				System.out.print("* ");
			}
			if(i<n/2+1)
			{
				star1--;
				space+=2;
			}
			else
			{
				star1++;
				space-=2;
			}	
			//star2--;
			System.out.println();
		}
		
	}
}