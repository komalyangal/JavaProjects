package collections;
import java.util.*;
public class SetMethod {

	public static void main(String[] args) {
		Set<String> s=new HashSet<>();
		s.add("komal");
		s.add("Alice");
		System.out.println(s);
		s.clear();
		s.add("peru");
		s.add("sakshi");
		System.out.println(s);
		System.out.println(s.equals(1));
		
		//LinkedSet
		
		Set <Double> s1=new LinkedHashSet<>();
		s1.add(12.3);
		s1.add(45.5);
		s1.add(11.0);
	
		System.out.println(s1);
		
		//Tree Set
		Set<Integer> s2=new TreeSet<>();
		s2.add(30);
		s2.add(40);
		s2.add(20);
		s2.add(10);
		System.out.println("Tree set "+s2);
		
		int a[]= {1,2,5,3,4};
		for(int i=0;i<5;i++)
		{
			s2.add(a[i]);
			
		}
		System.out.println(s2);
		
	}

}
