package com.sunbeam.p1;

interface I1 {
	void m1();

	void m2();

	default void m3() {
		System.out.println("I1::m3() called");
	}

	static void m4() {
		System.out.println("I1::m4() called");
	}

}

class Test implements I1 {

	@Override
	public void m1() {
		System.out.println("m1() called");
	}

	@Override
	public void m2() {
		System.out.println("m2() called");
	}

	@Override
	public void m3() {
		System.out.println("m3() called");
	}

}

public class Program02 {

	public static void main(String[] args) {
		I1 ref = new Test();
		ref.m1();
		ref.m2();
		ref.m3();
		I1.m4();

	}

}
