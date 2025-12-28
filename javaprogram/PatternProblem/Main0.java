// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class Main0 {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
	int m=n;
	n=n+2;
        for(int i=1;i<=n;i++)
        {
              for(int j=1;j<=m;j++)
        {
            if( j==m ||j==1|| i==1||i==n)
            {
                System.out.print("* ");
            }
            else 
                System.out.print("  ");
        }
        System.out.println();
    }}
}