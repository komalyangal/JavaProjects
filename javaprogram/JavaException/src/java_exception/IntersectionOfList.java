package java_exception;

import java.util.*;

public class IntersectionOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l= new ArrayList<>(Arrays.asList(1,2,3,4));
		List<Integer>l2= Arrays.asList(8,7,3,4);
		l.retainAll(l2);
		System.out.println("Intersection "+l);
		List<Integer>l3=new ArrayList<>();
		l3.add(12);
		l3.add(34);
		l3.add(45);
		System.out.println(l3);
		Collections.reverse(l3);
		System.out.println("Max "+Collections.max(l3));
		System.out.println(l3);
	}

}
