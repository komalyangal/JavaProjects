package com.app.fruits;

public class Mango extends Fruit {
	public Mango() {
		super("Mango");
	}
	public Mango(String color, double weight) {
		super("Mango");
		this.color = color;
		this.weight = weight;
	}
	@Override
	public String toString() {
		
		return "Mango [toString()=" + super.toString() + "]";
	}
	
	@Override
	public String taste() {
		return "sweet";
	}
}
