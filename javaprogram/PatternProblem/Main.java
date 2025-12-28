// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space =n-1;
        int star=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print(" "+" ");
            }
            for(int k=1;k<=star;k++)
            {
                if(k==1 || k==star ||i==(n/2+1))
                {
                    System.out.print("* ");
                }
                else
                    System.out.print(" "+" ");
            }
	 		
 		space--;
 		star+=2;
		System.out.println();
        }
    }
}