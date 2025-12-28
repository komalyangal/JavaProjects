import java.util.*;
import java.text.*;
class Account
{
	DecimalFormat f=new DecimalFormat("##,###.00 'Rupee'");
	DecimalFormat f1=new DecimalFormat("##,###.00 'Doller'");
	Scanner sc=new Scanner(System.in);

	private int CN,pn;
	double CB=2000;
	double SB=1000;
	void setCustomerNumber(int cn)
	{
		CN=cn;
	}
	void setPinNumber(int pn)
	{
		this.pn=pn;
	}
	int getCustomerNumber()
	{
		return CN;
	}
	int getPinNumber()
	{
		return pn;
	}
	void getCurrentBalance()
	{
		System.out.println("Your Current Balance : "+f.format(CB));
	}
	void getSavingBalance()
	{
		System.out.println("Your Saving Balance : "+f1.format(SB));
	}
	void getCurrentWithdrawInput()
	{
		System.out.println("Your Current Balance : "+f.format(CB));
		System.out.println("Enter the amount you want to withdraw");
		double amount=sc.nextDouble();
		
		if((CB-amount)>=0)
		{
			calCurrentWithdraw(amount);
			System.out.println("\nTrasaction Successfull !");
			System.out.println("New Current Account Balance : "+f.format(CB));
			
		}
		else
		{
			System.out.println("Insuffient Balance!!");
		}
	}
	double calCurrentWithdraw(double amt)
	{
		CB=CB-amt;
		return CB;
	}
	void getSavingWithdrawInput()
	{
		System.out.println("Your Saving Balance : "+f.format(SB));
		System.out.println("Enter the amount you want to withdraw");
		double amount=sc.nextDouble();
		
		if((SB-amount)>=0)
		{
			calCurrentWithdraw(amount);
			System.out.println("\nTrasaction Successfull !");
			System.out.println("New Saving Account Balance : "+f.format(CB));
			
		}
		else
		{
			System.out.println("Insuffient Balance!!");
		}
	}
	double calSavingWithdraw(double amt)
	{
		SB=SB-amt;
		return SB;
	}

}

class OptionMenu extends Account
{
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,Integer> data=new HashMap();
	
	void getLogin()
	{
		int i=15;
		do
		{
			try
			{
				data.put(11111,111);
				data.put(11112,222);
				data.put(11113,333);
				data.put(11114,444);
				data.put(11115,111);
				
				System.out.println("******** Welcome To DKTE ATM *********");
				System.out.print("\nEnter Account Number : ");
			    setCustomerNumber(sc.nextInt());
			    System.out.print("Enter Pin Number : ");
			    setPinNumber(sc.nextInt());
			    
			    int P=getCustomerNumber();
			    int Q=getPinNumber();
			    
			    if(data.containsKey(P) && data.get(P)==Q)
			    {
			    	getAccountType();
			    }
			    else
			    {
			    	System.out.println("Wrong CN Or PN");
			    }
			}
			catch(Exception e)
			{
				System.out.println("Please Enter Only Numbers");
				System.out.println("Characters and symbols are not allowed.");
				i=20;
			}
		    
		}while(i==15);
	}
	void getCurrent()
	{
		System.out.println("\nCURRENT ACCOUNT ");
		System.out.println("TYPE 1 : View Balance ");
		System.out.println("TYPE 2 : Withdraw Funds");
		System.out.println("TYPE 3 : Deposit Funds");
		System.out.println("TYPE 4 : Exit");
		System.out.print("\nChoice : ");
		 int ch2=sc.nextInt();
		 switch(ch2)
			{
				case 1:
					getCurrentBalance();
					getAccountType();
					break;
				case 2:	getCurrentWithdrawInput();		
						getAccountType();
					break;
				case 3:
					break;
				case 4:
					System.out.println("\nThank You For Using this ATM!");
					System.out.println("VISIT AGAIN!\n");
					getAccountType();
					break;
					
				default:System.out.println("\nInvalid Choice!");
						System.out.println("please Enter valid Choice.");
						getAccountType();
						break;
					
			}
	}
	void getSaving()
	{
		System.out.println("\nSaving ACCOUNT ");
		System.out.println("TYPE 1 : View Balance ");
		System.out.println("TYPE 2 : Withdraw Funds");
		System.out.println("TYPE 3 : Deposit Funds");
		System.out.println("TYPE 4 : Exit");
		System.out.print("\nChoice : ");
		int ch3=sc.nextInt();
		switch(ch3)
		{
			case 1:
				getSavingBalance();
				getAccountType();
				break;
			case 2: getSavingWithdrawInput();
					getAccountType();
				break;
			case 3:
				break;
			case 4:
				System.out.println("\nThank You For Using this ATM!");
				System.out.println("VISIT AGAIN!");
				getAccountType();
				break;
				
			default:System.out.println("\nInvalid Choice");
					System.out.println("please Enter valid Choice.");
					getAccountType();
					break;
		}
	
	}
	void getAccountType()
	{
		System.out.println("\nSelect the ACCOUNT TYPE you want to access : ");
		System.out.println("TYPE 1 : Current Account");
		System.out.println("TYPE 2 : Saving Account");
		System.out.println("TYPE 3 : Exit");
		System.out.print("\nChoice : ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:getCurrent();
			break;
		case 2:getSaving();
		break;
			
		case 3:
			System.out.println("\nThank You For visiting!");
			System.out.println("VISIT AGAIN!");
			break;
		
		default:
			System.out.println("\nInvalid Choice");
			System.out.println("please Enter valid Choice.");
			getAccountType();
			break;
		}
	}
}

public class ATM_11_06 extends OptionMenu
{
	public static void main(String[] args) 
	{
		OptionMenu om=new OptionMenu();
		om.getLogin();
	}

}
