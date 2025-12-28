package collections;
import java.util.*;
public class Bank {

	HashMap<Integer,Account> hm=new HashMap<>();
	Account ac;
	public void addAccount(Account ac)
	{
		hm.put(ac.getAccount_number(),ac);
	}
	void removeAccount(Account accno)
	{
		hm.remove(accno);
	}
	Account getAccount(int accno)
	{
		return hm.get(ac.getName());
	}
	int getCount()
	{
		return hm.size();
	}
//	HashMap<Integer,Account> getAllAccount()
//	{
//		return hm.values();
//	}
}
