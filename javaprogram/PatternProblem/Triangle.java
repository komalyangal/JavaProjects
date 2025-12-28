import java.util.Scanner;
class Triangle
{
	public static void main(String [] arg)
	{
		int row,col;
		System.out.println("Enter the row and column ");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		//col=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.print("\n");
		}
	}
}