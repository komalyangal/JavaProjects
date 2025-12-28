package com.app.geometry;

public class Point2D {
	private int x;
	private int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		return "(" + x + "," + y + ")";
	}

	public boolean isEqual(Point2D p) {
		if (this.x == p.x && this.y == p.y)
			return true;
		return false;
	}

	public double calculateDistance(Point2D p) {
		double distance = 0;
		// To-Do
		return distance;
	}

}
