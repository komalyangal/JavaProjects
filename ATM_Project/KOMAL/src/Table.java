class  Table_1 extends Thread 
{
	int n;
	Table_1(int m)
	{
		n=m;
	}
	synchronized void  print()
	{
			
			for(int i=1;i<=10;i++)
			{
				System.out.println("5*"+i+"="+n*i);
			}	
	}
	public  void run() {
		print();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("7*"+i+"="+n*i);
		}
	}
}
public class Table {

	public static void main(String[] args) {
	
		
		Table_1 t=new Table_1(5);
		Table_1 t2=new Table_1(7);

		Thread t1=new Thread( t);
		Thread t3=new Thread( t2);
		t1.start();
//		t3.start();
}
}
