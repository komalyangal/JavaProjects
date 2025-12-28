package com.app.fruits;

public class Apple extends Fruit {
	public Apple() {
		super("Apple");
	}
	
	
	public Apple(String color,double weight)
	{
		super("Apple");
		this.color = color;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [toString()=" + super.toString() + "]";
	}
	
	@Override
	public String taste() {
		return "sweet n sour";
	}

}
