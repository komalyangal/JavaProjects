package collections;

import java.util.*;

public class UseTreeset {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
//		Comparator c=new Comparator<Treesetmethods>();
		TreeSet<Treesetmethods> t=new TreeSet<>();
		Treesetmethods b1=new Treesetmethods("let","kane",900.00);
		Treesetmethods b2=new Treesetmethods("let us c","kane kma",990.00);

		Treesetmethods b3=new Treesetmethods("let","kae",910.00);
		t.add(b1);
		t.add(b2);
		t.add(b3);
		System.out.println(t+"\n");

	}

}
