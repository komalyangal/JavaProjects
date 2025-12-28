package collections;
import java.util.*;

public class TreeSetMethod   {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name ");
		for(int i=0;i<5;i++)
		{
			String  n=sc.next();
			ts.add(n);
		}
		System.out.println(ts);
		System.out.println("first element "+ts.first());
		System.out.println(ts.contains("k"));
		System.out.println(ts.lower("d"));
		System.out.println(ts.higher("a"));
	}

}
