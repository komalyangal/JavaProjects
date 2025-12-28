package collections;

import java.util.*;

public class Fruits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList l=new ArrayList<>();
		String f;
		System.out.println("Enter the fruits");
		for(int i=0;i<5;i++)
		{
			f=sc.next();
			l.add(f);
		}
		System.out.println(l);
		System.out.println("Enter which fruit you want to search");
		String fs=sc.next();
		if(l.contains(fs))
		{
			l.remove(fs);
			System.out.println(l);
		}
		else
		{
			System.out.print("Fruit is not found");
		}
		

	}

}

