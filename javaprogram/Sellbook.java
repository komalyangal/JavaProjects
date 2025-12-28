import java.util.Scanner;
class Book
{
	Scanner sc=new Scanner(System.in);

	int stock=5;
	String  bookname []=new String [stock];
	double bookprice []=new double [stock];
	
	void set()
	{
		System.out.println("Enter the books and prices ");
		for(int i=0;i<stock;i++)
			bookname[i]=sc.next();
		for(int i=0;i<stock;i++)
			bookprice[i]=sc.nextDouble();
	}
 	void get()
	{
		System.out.println("\n BOOKS STOCK \n");
		for(int i=0;i<stock;i++)
		{
			System.out.println((i+1)+" Book name and Book price "+" is "+bookname[i]+":"+bookprice[i]);
		}
	}
	

}
class Sellbook
{
	public static void main(String [] arg)
	{
		String sbookname;
		double amount,bill;
		int no_coppies;
		Scanner sc=new Scanner(System.in);

		Book b=new Book();
		b.set();
		b.get();
		
		System.out.println("Enter the which book you want ");
		sbookname=sc.next();

		int pos=-1,count=0;
		boolean flag=false;

		for(int i=0;i<b.stock;i++)
		{
			if(b.bookname[i].equalsIgnoreCase(sbookname)){
				pos=i;
				count+=1;
				flag=true;	
			}	
		}
		if(flag==true)
		{
			System.out.println("Book is available");

			System.out.println("Enter the how many copies you want ");
			no_coppies=sc.nextInt();

			//System.out.println("count "+count);
			if(count==no_coppies)
			{
				//System.out.println("Index prices is "+(pos+1));
				bill=b.bookprice[pos]*no_coppies;
				System.out.println("Total Bill is "+bill);
			}
			else
				System.out.println("Only "+count+" Book available ");
		}
		else
			System.out.println("Book is not available");

	}
}