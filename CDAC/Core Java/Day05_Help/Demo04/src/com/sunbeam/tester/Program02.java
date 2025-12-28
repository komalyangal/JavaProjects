package com.sunbeam.tester;

import com.sunbeam.entities.Date;
import com.sunbeam.exceptions.InvalidDateException;

public class Program02 {

	public static void main(String[] args) {
		Date d1 = new Date();
		try {
			d1.setMonth(12);
			d1.setYear(2024);
			System.out.println("d1 = " + d1);
		} catch (InvalidDateException e) {
			e.printStackTrace();
		}

	}

}
