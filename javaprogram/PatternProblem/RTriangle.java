import java.util.Scanner;
class RTriangle
{
	public static void main(String [] arg)
	{
		int row,col;
		System.out.println("Enter the row and column ");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		//col=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=i;j<=row;j++)
			{
				System.out.print(" "+"*");
			}
			System.out.print("\n");
		}
	}
}