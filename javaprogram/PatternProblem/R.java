import java.util.Scanner;
class Main1R {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
              for(int j=1;j<=n;j++)
        {
            if(j==1|| j==n/2-1 ||i==1|| (j==n && i<=n/2+1)||i==n/2+1 || 
		(i==5 && j==3)||
		(i==4 && j==2))
            {
                System.out.print("* ");
            }
            else 
                System.out.print("  ");
        }
        System.out.println();
    }
}}