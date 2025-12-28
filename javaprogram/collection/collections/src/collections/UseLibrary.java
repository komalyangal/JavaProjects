package collections;

import java.util.HashSet;

public class UseLibrary {
	
	public static void main(String[] args) {

		Book b=new Book("komal ","ksy",200.0);
		Book b1=new Book("sakshi ","srp",300.0);
		Book b2=new Book("saish ","svw",240.0);
		Book b3=new Book("shravani ","snk",500.0);
		Book b4=new Book("shravani ","snk",500.0);
		Library l=new Library();
		l.add_book(b);
		l.add_book(b1);
		l.add_book(b2);
		l.add_book(b3);
		l.add_book(b4);
		
		HashSet<Book> hs= (HashSet<Book>) l.getAllbook();
		b.show();
		b1.show();
		b2.show();
		b3.show();
		b4.show();
//		for(Book bk :hs)
//			System.out.println(bk);
		
	}

}
