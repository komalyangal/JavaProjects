import java.util.Scanner;

class  Person
{
	String name,address;
	float height,weight;
	int d,m,year;
int age;
	void setPdetails(String name, int d,int m,int year ,String address,float height,float weight)
	{
		this.name=name;
		this.d=d;
		this.m=m;
		this.year=year;
		this.address=address;
		this.height=height;
		this.weight=weight;
	}
	void calculateAge(int d,int m,int year)
	{
		
		age=2024-year;
	
	}
	
}
class Student extends Person
{
	String roll_num;
	int total;
    float avg;
	void setSdetails(String roll_num)
	{
		this.roll_num=roll_num;
	}	
	
	void calculateAvg(int marks[],int n)
	{
		for(int i=0;i<n;i++)
			total+=marks[i];
		avg=total/n;
	}
	void getSdetails()
	{
		System.out.println("\nStudent name :- "+name);	
		System.out.println("Student address :- "+address);	
		System.out.println("Student DOB:- "+d+"/"+m+"/"+year);
		System.out.println("Student height:- "+height);
		System.out.println("Student weight:- "+weight);	
		System.out.println("Student Age:- "+age);
		System.out.println("Student roll number "+roll_num);					
		System.out.println("Average of marks is "+avg);
	}
}

class Employee extends Person
{
	
	String emp_id;
	double salary;
	void setEdetails(String emp_id,double salary)
	{
		this.emp_id=emp_id;
		this.salary=salary;
 	}
	void getEdetails()
	{
		System.out.println("\nEmployee name :- "+name);	
		System.out.println("Employee address :- "+address);	
		System.out.println("Employee DOB:- "+d+"/"+m+"/"+year+"/");
		System.out.println("Employee height:- "+height);
		System.out.println("Employee weight:- "+weight);
		System.out.println("Employee id is "+emp_id);
		System.out.println("Employee salary is "+salary);
	}
	
		

}
class TestExperiment5
{
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		String name,address;
		float height,weight;
		int d,m,year;	

		System.out.println("Enter the name ");	
		name=sc.nextLine();
		System.out.println("Enter the address ");
		address=sc.nextLine();
		System.out.println("Enter the height ");
		height=sc.nextFloat();
		System.out.println("Enter the weight ");
		weight=sc.nextFloat();
		System.out.println("Enter the DOB");
 		d=sc.nextInt();
		m=sc.nextInt();
		year=sc.nextInt();
		
 		Student s=new Student();
		s.setPdetails(name, d,m, year , address, height, weight);
		
		String roll_num;
		int n;
		
		
		System.out.println("Enter the roll number ");
		roll_num=sc.next();

		System.out.println("Enter the no.of subjects ");	
		n=sc.nextInt();
		int marks[]=new int [n];
		System.out.println("Enter the marks of students ");
		for(int i=0;i<n;i++)
			marks[i]=sc.nextInt();

		s.setSdetails(roll_num);
		s.calculateAge(d,m,year);
		s.calculateAvg(marks,n);
		s.getSdetails();
		

		String emp_id;
		double salary;
	
		System.out.println("\n Enter the Employee id ");
		emp_id=sc.next();	
		System.out.println("Enter the salary ");
		salary=sc.nextDouble();
		
		Employee e=new Employee();
		e.setPdetails(name, d,m, year , address, height, weight);
		e.setEdetails(emp_id,salary);
		e.getEdetails();

	}
}

 














