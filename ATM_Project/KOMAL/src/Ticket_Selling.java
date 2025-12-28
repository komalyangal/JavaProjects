import java.util.*;
public class Ticket_Selling extends Thread
{
	String name;
	 int total=5;

	public void run()
	{
		Scanner sc=new Scanner(System.in);
		do
		{
			if(total==0) 
				break;
				System.out.println("Enter Your Name : ");
				name=sc.next();
				System.out.println("Hello "+name);
				System.out.println("Enter how many seats you want to book ");
				int n=sc.nextInt();
				if(n<=total)
				{
					
					System.out.println("\nCongrates seats are book ");
					total-=n;
					
				}
				else {
					System.out.println("\n sorry seats are not available ");
					}
		}while(true);
		
	}
	
	public static void main(String[] args) 
	{
		Ticket_Selling t=new Ticket_Selling();
		t.start();
		String name;
		 int total=5;

		try
		{
			Scanner sc=new Scanner(System.in);
			do
			{
				if(total==0) 
					break;
					System.out.println("Enter Your Name : ");
					name=sc.next();
					System.out.println("Hello "+name);
					System.out.println("Enter how many seats you want to book ");
					int n=sc.nextInt();
					if(n<=total)
					{
						
						System.out.println("\nCongrates seats are book ");
						total-=n;
						
					}
					else {
						System.out.println("\n sorry seats are not available ");
						System.out.println("Seats are available "+total);
						}
			}while(true);
			
		}
		catch(Exception e)
		{
			
		}
	}
}
