import java.util.Scanner;
class MainJ {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
              for(int j=1;j<=n;j++)
        {
            if(  i==1||j==n/2+1|| (i==n && j<=n/2)
            
            )
            {
                System.out.print("* ");
            }
            else 
                System.out.print("  ");
        }
        
        System.out.println();
    }}
}