package collections;

import java.util.*;

public class ListMethods {

	public static void main(String[] args) {
		List <String> l=new ArrayList<>();
		System.out.println("Initial size of the list "+l.size());
		l.add("komal");
		l.add("Sakshi");
		l.add("shravani");
		System.out.println(l);
		l.sort(null);
		
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		System.out.println(l.contains("komal"));
		l.add("Saish");
		System.out.println(l.get(0));
		l.add(2, "isha");
		System.out.println(l);
		System.out.println(l.toArray());
	}

}
