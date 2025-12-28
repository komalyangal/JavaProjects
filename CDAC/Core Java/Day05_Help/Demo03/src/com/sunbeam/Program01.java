package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		try {
			t1.setHrs(10);
			t1.setMins(70);
			System.out.println("t1 = " + t1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
