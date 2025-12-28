import java.util.Scanner;
class P12
{
	public static void main(String [] arge)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=sc.nextInt();
		int space=0;
		int star=n;
		for(int i=1;i<=n*2-1;i++)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*"+" ");
			}
			if(i<n)
			{
				star--;	
				space+=2;
			}
			else
			{
				star++;
				space-=2;
			}			
			System.out.println();
		}
		
	}
}
