package collections;
import java.util.*;

public class Library  {
	
	private Set<Book> s;
	
	public Library()
	{
		s=new HashSet<>();
		
	}
	boolean add_book(Book b)
	{
		return s.add(b);	
	}
	int  getBookCount()
	{
		return s.size();
	}
	public Set<Book> getAllbook()
	{
		return s;
		
	}
}
