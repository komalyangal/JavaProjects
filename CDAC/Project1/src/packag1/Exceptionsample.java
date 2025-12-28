
package packag1;
import java.util.*;

public class Exceptionsample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int res=0;
	
		System.out.println("Enter the x coordinates ");
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		System.out.println("Enter the y coordinates ");
		int y1=sc.nextInt();
		int y2=sc.nextInt();
		try
		{
			
			int y=y2-y1;
			int x=x2-x1;
			res=y/x;
			System.out.println("Slop is "+res);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
