package com.sunbeam.entities;

public class Apple extends Fruit {

	public Apple() {
		super("Apple");
	}

	@Override
	public String taste() {
		return "sweet and sour";
	}
}
