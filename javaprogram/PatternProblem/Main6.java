// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class Main6 {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
              for(int j=1;j<=n;j++)
        {
            if( (j==n&&  i>=n/2+1) ||(j==1)|| i==n || i==1 || i==n/2+1)
            {
                System.out.print("* ");
            }
            else 
                System.out.print("  ");
        }
        System.out.println();
    }}
}