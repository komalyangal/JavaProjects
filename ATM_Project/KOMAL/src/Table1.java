class Table12
{
	synchronized void print(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*n);
		}
	}
}
class Five extends Thread
{
	Table12 abc;
	Five(Table12 t)
	{
		abc=t;
	}
	public void run()
	{
		abc.print(5);
		
	}
}
class Seven extends Thread
{
	Table12 abc1;
	Seven(Table12 t)
	{
		abc1=t;
		
	}
	public void run()
	{
		abc1.print(7);

		
	}
}
public class Table1 
{
	public static void main(String []af)
	{
		Table12 t=new Table12();
		
		Five f=new Five(t);
		Seven s=new Seven(t);
		
		f.start();
		s.start();
	}

}
