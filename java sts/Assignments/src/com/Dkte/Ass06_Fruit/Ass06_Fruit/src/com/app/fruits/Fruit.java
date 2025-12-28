package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	public Fruit() {
	}
	
	public Fruit(String name) {
		this.name=name;
		isFresh=true;
	}

	public Fruit(String color, double weight) {
		this.color = color;
		this.weight = weight;
		
	}
	
	
	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	@Override
	public String toString()
	{
		return "Name - "+name+"\t"+"Weight- "+weight+"\t"+"Color- "+color;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String taste()
	{
		return "No specific taste";
	}
	
	public final void accept(Scanner sc) {
		System.out.println("Enter color ");
		color=sc.next();
		System.out.println("ENter weight ");
		weight=sc.nextDouble();
	}
	
}
