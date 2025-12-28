// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class MainQ {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
              for(int j=1;j<=n;j++)
        {
            if( (i==1  && j<n)|| (j==1&& i<n ) || 
		(j==n && i<n )||(i==n &&j<n) || (i==j && i>=3))
            {
                System.out.print("* ");
            }
            else 
                System.out.print("  ");
        }
        System.out.println();
    }}
}