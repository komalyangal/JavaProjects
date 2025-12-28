package com.sunbeam.entities;

import com.sunbeam.exceptions.InvalidTimeException;

public class Time {
	private int hrs;
	private int mins;

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		if (hrs < 0 || hrs > 23)
			throw new InvalidTimeException();
		this.hrs = hrs;
	}

	public int getMins() {
		return mins;
	}

	public void setMins(int mins) {
		if (mins < 0 || mins > 59)
			throw new InvalidTimeException("mins should be between 0 and 59");
		this.mins = mins;
	}

	@Override
	public String toString() {
		return "Time [hrs=" + hrs + ", mins=" + mins + "]";
	}

}
