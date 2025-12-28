package com.sunbeam.entities;

import com.sunbeam.exceptions.InvalidDateException;

public class Date {
	private int month;
	private int year;

	public void setMonth(int month) throws InvalidDateException {
		if (month < 1 || month > 12)
			throw new InvalidDateException();

		this.month = month;
	}

	public void setYear(int year) throws InvalidDateException {
		if (year < 2000)
			throw new InvalidDateException("Year should be > 2000");
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [month=" + month + ", year=" + year + "]";
	}

}
