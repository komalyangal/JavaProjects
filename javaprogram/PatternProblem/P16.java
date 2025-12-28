import java.util.Scanner;
class P16
{
	public static void main(String [] arge)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=sc.nextInt();
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
				if(i==j )
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			if(i<n/2){
				star+=2;	
				space-=2;
			}
			else
			{
				star-=2;
				space+=2;
			}			
			System.out.println();
		}
		
	}
}
