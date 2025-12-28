import java.util.Scanner;
 class P20
{
 	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number ");
		n=sc.nextInt();
		int space=n/2;
		int star=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=space;k++)
			{	
				System.out.print(" "+" ");
			}
		
			for(int j=1;j<=star;j++)
			{
				if(j==1 || j==star)
					System.out.print("* ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
			if(i>n/2)
			{
				space++;
				star-=2;
			}
			else
			{
			space--;
			star+=2;
}
		}
	}
}