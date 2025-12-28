package com.sunbeam.entities;

import java.util.Scanner;

public class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh;

	public Fruit() {
	}

	public Fruit(String name) {
		this.name = name;
		isFresh = true;
	}

	public String getName() {
		return name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public final void accept(Scanner sc) {
		System.out.print("Enter the color - ");
		color = sc.next();
		System.out.print("Enter the weight - ");
		weight = sc.nextDouble();
	}

	public String taste() {
		return "no specific taste";
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}

}
