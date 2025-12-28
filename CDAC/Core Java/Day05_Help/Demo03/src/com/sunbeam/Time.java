package com.sunbeam;

public class Time {
	private int hrs;
	private int mins;

	public int getHrs() {
		return hrs;
	}

	// unchecked exception
	public void setHrs(int hrs) {
		if (hrs < 0 || hrs > 23)
			throw new RuntimeException("hrs should be between 0 to 24");
		this.hrs = hrs;

	}

	public int getMins() {
		return mins;
	}

	// checked exception
	public void setMins(int mins) throws Exception {
		if (mins < 0 || mins > 59)
			throw new Exception("mins should be between 0 to 59");

		this.mins = mins;
	}

	@Override
	public String toString() {
		return "Time [hrs=" + hrs + ", mins=" + mins + "]";
	}

}
