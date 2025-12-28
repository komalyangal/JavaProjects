import java.util.Scanner;
class P8
{
	public static void main(String [] arg)
	{
		int n;
		System.out.println("Enter the size ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int star=1;

		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			if(i<n)
				star++;	
			else
				star--;

			System.out.println();
		}
}
}