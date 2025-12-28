import java.util.Scanner;
class P13
{
	public static void main(String [] arge)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=sc.nextInt();
		int space=n-1;
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
			if(i<n){
				space-=1;
				star--;	
			}
			else
			{
				space+=1;
				star++;
			
			}
			System.out.println();
		}
		
	}
}
