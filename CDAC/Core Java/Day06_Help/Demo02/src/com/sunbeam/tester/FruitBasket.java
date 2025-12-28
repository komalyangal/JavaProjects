package com.sunbeam.tester;

import com.sunbeam.entities.Fruit;
import com.sunbeam.entities.Mango;

public class FruitBasket {

	public static void main(String[] args) {
		Fruit[] basket = new Fruit[10];
		int index = 0;
		// case-1,2,3
		if (index < 10) {
			basket[index] = new Mango();
			basket[index].accept(null);
			index++;
		}

		// case-4
		for (Fruit f : basket)
			if (f != null)
				System.out.println(f.getName());

		// case-5
		for (Fruit f : basket)
			if (f != null && f.isFresh()) {
				System.out.println(f);
				System.out.println("taste = " + f.taste());
				System.out.println("Fruit is Fresh - " + f.isFresh());

			}

		// case-6
		for (Fruit f : basket)
			if (f != null && !f.isFresh())
				System.out.println(f);

		// case-7
		int i = 3;
		basket[i].setFresh(false);

		// case-8
		for (Fruit f : basket)
			if (f != null && f.taste().equals("sour"))
				f.setFresh(false);
	}

}
