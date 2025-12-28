public class Test {
	public static void main(String[] args) {
		Cons c = new Cons();
		c.show();
		Cons co = new Cons("cpp", 200);
		co.show();
		Cons con = co;
		con.show();
	
}
}

class Cons {
	String bookname;
	int bookprice;

	Cons() {
		bookname = "c";
		bookprice = 100;
	}

	Cons(String bookname, int bookprice) {
		this.bookname = bookname;
		this.bookprice = bookprice;
	}

	Cons(Cons b) {
		this.bookname = b.bookname;
		this.bookprice = b.bookprice;
	}

	void show() {
		System.out.println("book price is" + bookprice);
		System.out.println("bookname is" + bookname);
	}

}


