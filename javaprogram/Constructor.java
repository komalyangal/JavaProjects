import java.util.Scanner;
class Con
{
	String fname,lname;
	double salary;
	Con()
	{
		fname="komal";
		lname="Yangal";
		salary=0;
	}
	Con(String fname, String lname,double salary)
	{
		this.fname=fname;
		this.lname=lname;
		this.salary=salary;
	}
	void details()
	{
		System.out.println("first name is "+fname);
		System.out.println("Last name is "+lname);
		System.out.println("Salary is "+salary);
	}
}
class Constructor
{	
	public static void main(String [] ags)
	{
		String fname,lname;
		double salary;
		Scanner sc=new Scanner(System.in);
		Con c=new Con();
		//c.details();
		System.out.println("Enter the first name ");
		fname=sc.next();
		System.out.println("Enter the last name ");
		lname=sc.next();
		System.out.println("Enter the salary ");
		salary=sc.nextDouble();
		Con cs=new Con(fname,lname,salary);
		cs.details();
	}
}