import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;


class Student
{
	String name;
	String prn;
	int age,totalm;

	Student()
	{}
	Student(String na,String p,int age,int tm)
	{
		name=na;
		prn=p;this.age=age;
		totalm=tm;
	}

	String getName()
	{
		return name;
	}
	String getprn()
	{
		return prn;
	}
	int getage()
	{
		return age;
	}
	int getTotalm()
	{
		return totalm;
	}
}

class StudentLinkedlist
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> studentDetails=new LinkedList<Student>();
		
		String name,prn;
		int age,tm;

		Student s[]=new Student[2];
		

		for(int i=0;i<2;i++)
		{
			System.out.println("Enter name and prn of "+(i+1)+"number student");
			name=sc.nextLine();
			sc.nextLine();
			prn=sc.next();

			System.out.println("Enter age and total marks of corresponding student ");
			age=sc.nextInt();
			tm=sc.nextInt();

			s[i]=new Student(name,prn,age,tm);
			studentDetails.add(s[i]);
		}
		System.out.println("Size of arraylist "+studentDetails.size());

		/*for(int i=0;i<2;i++)
		{
			
		}*/
		for(int i=0;i<2;i++)
		{
			System.out.println(i+1+"Student details : ");

			System.out.println("Name : "+studentDetails.get(i).getName());
			System.out.println("Prn : "+studentDetails.get(i).getprn());
			System.out.println("Prn : "+studentDetails.get(i).getage());
			System.out.println("Prn : "+studentDetails.get(i).getTotalm());
		}
		Student s1=new Student();
		System.out.println(studentDetails);
		s1=studentDetails.remove(1);
		System.out.println(studentDetails);
		System.out.println("Name of removed student is : "+s1.getName());
		System.out.println("Age of removed student is : "+s1.getage());

		Student s2=new Student("shruit n","22ucs13",12,300);
		System.out.println("Is present "+studentDetails.contains(s2));
		
	}
	
}