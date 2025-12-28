package com.sunbeam.entities;

public class Orange extends Fruit {

	public Orange() {
		super("Orange");
	}

	@Override
	public String taste() {
		return "sour";
	}
}
