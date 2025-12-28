package Stringoperations;
interface operation
{
	String toggle(String text);
	void sentence(String text2);
	void word(String text3);
}
public class pack implements operation
{
	public String toggle(String text)
	{
		int var;
		char ch;
		String result=" ";
		for(int i=0;i<text.length();i++)
		{
			ch=text.charAt(i);
			if(Character.isLowerCase(ch))
			{
				result+=Character.toUpperCase(ch);
			}
			else if(Character.isUpperCase(ch))
			{
				result+=Character.toLowerCase(ch);
			}
			else	
				result+=ch;	
		}
		return result;
		
	}
	public void sentence (String text2)
	{
		String str,result,rem;

		str=text2.substring(0,1);
		result=str.toUpperCase();
		rem=text2.substring(1);	
		System.out.println("\nThe sentence is:- "+(result+rem));	
	}
	public void word(String text3)
	{
		 String words[]=text3.split("\\s+");
		String cap,finals,rem;
		finals=" ";
		for(String word:words)
		{
			cap=word.substring(0,1).toUpperCase();
			rem=word.substring(1);
			finals=finals+cap+rem+" ";
		}
		System.out.println("\nCapital string is:- "+finals);
		
		
	}


}
	