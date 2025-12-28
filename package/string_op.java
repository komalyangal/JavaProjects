import Stringoperations.*;
import java.util.Scanner;
class string_op
{
	public static void main(String [] arg)
	{
		pack p=new pack();
		Scanner sc=new Scanner(System.in);
		String text;
		System.out.println("Enter the string ");
		text=sc.nextLine();
		String str=p.toggle(text);	
		System.out.println("\nAfter toggling text is:- "+str);
		p.sentence(text);
		p.word(text);
	}
}