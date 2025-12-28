package com.sunbeam.p2;

// Functional Interface
@FunctionalInterface
interface I1 {
	void m1(); // Single Abstract Method
}

@FunctionalInterface
interface I2 {
	void m1(); // single abstaract method

	default void m2() {

	}

	static void m3() {

	}
}

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
