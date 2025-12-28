import java.util.Scanner;
class P6
{
	public static void main(String [] arg)
	{
		int n;
		System.out.println("Enter the size ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int space=0;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("* ");
			}
			space++;
			System.out.print("\n");
			
		}
	}
}