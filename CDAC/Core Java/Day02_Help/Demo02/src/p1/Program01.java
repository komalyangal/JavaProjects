package p1;

class Test01 {
	private int n1;
	int n2; // default - Package level private
	protected int n3;
	public int n4;

	void displayTest01() {
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}
}

public class Program01 {

	public static void main(String[] args) {
		Test01 t1 = new Test01();
		// System.out.println(t1.n1); // NOT OK
		System.out.println(t1.n2);
		System.out.println(t1.n3);
		System.out.println(t1.n4);
	}

}
