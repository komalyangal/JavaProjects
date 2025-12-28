package com.sunbeam.p1;

import java.util.Date;

//Generic class
class Box<T> {
	private T obj;

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Program {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.setObj(10);
		Integer i1 = b1.getObj();
		System.out.println("I1 = " + i1);
		// b1.setObj("sunbeam"); // NOT OK

		Box<String> b2 = new Box<String>();
		b2.setObj("sunbeam");
		String name = b2.getObj();
		System.out.println("Name = " + name);
		// b2.setObj(10);// NOT OK

		Box<Date> b3 = new Box<Date>();

	}

}
