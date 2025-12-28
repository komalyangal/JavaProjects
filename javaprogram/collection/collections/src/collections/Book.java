package collections;

import java.util.Objects;

public class Book {
	
	private String name,author;
	private double price;	
	
	public Book() {}
	public Book(String name, String author ,double price)
	{
		this.name=name;
		this.author=author;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(author, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	void show()
	{
		System.out.println(getName()+" "+getAuthor()+" "+getPrice());
	}
	
}
