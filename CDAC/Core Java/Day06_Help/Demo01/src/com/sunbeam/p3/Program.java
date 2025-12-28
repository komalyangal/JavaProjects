package com.sunbeam.p3;

import java.util.Date;

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
	// unbounded type parameter - ?
	public static void display(Box<?> b) {
		System.out.println("value = " + b.getObj());
	}

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.setObj(10);

		Box<String> b2 = new Box<String>();
		b2.setObj("sunbeam");

		Box<Date> b3 = new Box<Date>();
		b3.setObj(new Date());

		display(b1);
		display(b2);
		display(b3);
	}

}
