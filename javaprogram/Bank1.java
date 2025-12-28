/*write java program create banking system with three classes bank account,saving,current account,the bank shoud have 
a list of accounts & method
for adding them account should be an interface with method to deposite ,withdraw ,calculate interest,view balance ,saving account 
& current account shuld implement account
the account interface having own unique methods */

import java.util.Scanner;
interface account
{
	double deposite();
	double withdraw(double with_amt);
	double viewbalance();
}
class Saving_account
{
	double amount ,balance,minbal=1000;
	void set(double amt)
	{
		amount=amt;
	}
	public double deposite()
	{
		balance+=minbal+amount;
		return balance;
		
	}
	public double withdraw(double with_amt)
	{
		if(balance-with_amt>minbal)
		{
			balance-=with_amt;
			System.out.println("withdraw successfully ");
		}
		else
		{
			System.out.println("You cant withdraw money ");
		}
		
			return balance;
	}
	public double viewbalance()
	{
		return balance;
	}
}
class Current_account
{
	boolean overdraftlimit=true;
	double minbalance=10000,with_amt,balance,amount;
	void set(double amt)
	{
		amount=amt;
	}
	public double deposite()
	{
		balance=minbalance+amount;
		return balance;
	}
	public double withdraw(double with_mon)
	{

		if(balance-with_mon>=minbalance)
		{
			balance=balance-with_mon;
			System.out.println("withdraw successfully ");
		}
		else if(overdraftlimit && balance-with_mon<=minbalance)
		{
			overdraftlimit=false;
			balance=balance-with_mon;
			System.out.println("withdraw successfully ");
		}
		else
			System.out.println("You cannot withdraw money minimum balance is less ");
		return balance;
	}
	public double viewbalance()
	{
		return balance;
	}
}
class Bank1
{
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		double balance,amount,with_amt;
		int ch,ch1;
		Saving_account s=new Saving_account();
		
		Current_account c=new Current_account();
		while(true)
		{
			System.out.println("\n\n1.Saving account\n2.Current account\n3.Exit\n\nEnter your choice ");
			ch=sc.nextInt();
				if(ch==1)
				{	
					System.out.println("\n\n1.Deposite money in saving account\n2.Withdraw money in saving account\n3.View balance\nEnter your choice ");
					ch1=sc.nextInt();
					switch(ch1)
					{
						case 1:System.out.println("Enter the amount to deposite");
								amount=sc.nextDouble();
								s.set(amount);
								s.deposite();	
								break;
						case 2:System.out.println("Enter the amount to withdraw ");
							   with_amt=sc.nextDouble();
								s.withdraw(with_amt);
								System.out.println("\nBank balance is "+s.viewbalance());
								break;
						case 3:System.out.println("Bank balance is "+s.viewbalance());							
					}
				}
				else if(ch==2)
				{
						double curr_amount,with_curr_amt;
						System.out.println("\n\n1.Deposite money in current account \n2.Withdraw money in current account \n3.View balance\n\nEnter your choice ");
						ch1=sc.nextInt();
						switch(ch1)
						{
							case 1:System.out.println("\nEnter the amount to deposite");
									curr_amount=sc.nextDouble();
									c.set(curr_amount);
									c.deposite();
									break;
							case 2:System.out.println("Enter the amount to withdraw ");
									with_curr_amt=sc.nextDouble();
									c.withdraw(with_curr_amt);
									break;
							case 3:	System.out.println("\nBank balance is "+c.viewbalance());							
									break;
						}
				}
						
				else if (ch==3)
						System.exit(0);
			}
					
		
	}		
}