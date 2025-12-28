package collections;
import java.util.*;
import java.util.Map.Entry;
public class HashMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Long> hs=new HashMap<>();
		hs.put("komal", 9875682212L);
		hs.put("Ankita",7030081664L);
		hs.put("saish", 7796972622L);
		hs.put("saish1", 7779612345L);
		
	System.out.println(hs.get("om"));
	System.out.println(hs.put("komal", 1234567890L));
//	hs.clear();
	
	System.out.println(hs.containsValue(7796972622L));
//	System.out.println(hs.remove("komal",9875682212L ));
//	System.out.println(hs.remove("komal"));
	System.out.println(hs);
	Map.Entry<String, Long> se=(Entry<String, Long>) hs.entrySet();

	}

}
