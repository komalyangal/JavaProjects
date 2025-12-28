package collections;

public class UseBank {
	public static void main(String [] arg)
	{
		Account a1=new Account("komal",12345671,200.00);
		Account a2=new Account("Ankita",1234578,220.00);
		Account a3=new Account("Sakshi",123456789,2300.00);
		Account a4=new Account("Saish",123456709,2004.00);
		Bank b=new Bank();
		b.addAccount(a1);
		b.addAccount(a2);
		b.addAccount(a3);
		
		
		b.addAccount(a4);
		Account ans=b.getAccount(12345671);
		System.out.println();

	}
}
