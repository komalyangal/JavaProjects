package collections;
import java.util.*;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<>();
		l.add(12);
		l.addLast(11);
		l.addFirst(10);
		
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.push(9);
		System.out.println("push "+l);
		l.pop();
		System.out.println("pop "+l);
		l.remove();
		System.out.println(l);
		
		
	}

}
