package com.dkte;


public class Date {
	int day;
	int month;
	int year;

	public Date() {
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Date) {
			Date d2 = (Date) obj; 
			if (this.day == d2.day && this.month == d2.month && this.year == d2.year)
				return true;
		}
		return false;
	}

}
