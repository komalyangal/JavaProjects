import java.util.Scanner;
 class Num4
{
 	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number ");
		n=sc.nextInt();
		int space=n-1;
		int num;
		int star=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=space;k++)
			{	
				System.out.print(" "+" ");
			}
			num=i;		
			for(int j=1;j<=star;j++)
			{			
				if(j==1 || j==star)
					System.out.print(num+" ");
				else
					System.out.print("0 ");
	
			}
			System.out.println();
			space--;
			star+=2;

		}
	}
}