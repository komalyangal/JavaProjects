package com.app.geometry;

import java.util.Scanner;

class Point2D
{
	int xaxis;
	int yaxis;
	 Point2D()
	{}
	public Point2D(int xaxis, int yaxis) 
	{
		this.xaxis = xaxis;
		this.yaxis = yaxis;
	}
	public String getDetails() {
		return "Point2D [xaxis=" + xaxis + ", yaxis=" + yaxis + "]";
	}
	public boolean	equals(int x, int y)
	{
		if(this.xaxis==x && this.yaxis==y)
			return true;
		else
			return false;
		
	}
	double CalDistance(double x2,double y2)
	{
			double ans=y2-this.yaxis/x2-this.xaxis;
			return Math.sqrt(ans);
	}
	
}
public class AssignmentNo_05 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Points ");
		x=sc.nextInt();
		y=sc.nextInt();
		Point2D p=new Point2D(x,y);
		System.out.println(p.getDetails());
		System.out.println("Points are equal "+p.equals(10,12));
		System.out.println("Distance between two points "+p.CalDistance(10, 12));
		
	}

}
