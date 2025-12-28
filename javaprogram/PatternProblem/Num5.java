import java.util.Scanner;
 class Num5
{
 	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number ");
		n=sc.nextInt();
		int space=n-1;
	
		int star=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=space;k++)
			{	
				System.out.print(" "+" ");
			}
		int num=1;
			for(int j=1;j<=star;j++)
			{			
				if(j<(star/2)+1){
					System.out.print(num+" ");
					num++;
				}

				else{
					System.out.print(num+" ");

					num--;
}
	
			}
			System.out.println();
			space--;
			star+=2;

		}
	}
}