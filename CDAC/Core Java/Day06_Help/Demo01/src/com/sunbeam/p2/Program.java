package com.sunbeam.p2;

//Bounded Type Parameter
class Box<T extends Number> {
	private T obj;

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Program {
	// primitive types cannot be used in Generics
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		Box<Double> b2 = new Box<Double>();
		Box<Long> b3 = new Box<Long>();
		Box<Number> b4 = new Box<Number>();

		// Box<String> b2 = new Box<String>(); // NOT OK

		// Box<Date> b3 = new Box<Date>();//NOT OK
	}

}
