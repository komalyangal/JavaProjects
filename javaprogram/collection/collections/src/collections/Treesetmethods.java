package collections;

import java.util.Comparator;

public class Treesetmethods implements Comparator<Treesetmethods>{

	private String name,author;
	private double price;
	public Treesetmethods(String name, String author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Treesetmethods [name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int compare(Treesetmethods o1, Treesetmethods o2) {

		return Double.compare(o1.price, o2.price);
	}
	
	
}
