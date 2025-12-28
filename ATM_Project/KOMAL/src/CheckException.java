class komal extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Bye World!");
				Thread.sleep(2000);
				
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
public class CheckException {

	public static void main(String[] args)
	{
		komal k=new komal();
		k.start();
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello World");
				Thread.sleep(2000);
				
			}
		}
		catch(Exception e)
		{
			
		}
	}

}
