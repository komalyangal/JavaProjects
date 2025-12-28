package com.app.fruits;

public class Orange extends Fruit {
	public Orange() {
		super("Orange");
	}
	public Orange(String color, double weight) {
		super("Orange");
		this.color = color;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Orange [color=" + color + ", weight=" + weight + ", name=" + name + "]";
	}
	
	@Override
	public String taste() {
		return "sour";
	}
}
