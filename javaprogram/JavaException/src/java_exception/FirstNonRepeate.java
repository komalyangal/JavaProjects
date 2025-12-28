package java_exception;

import java.util.Scanner;

public class FirstNonRepeate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int freq []=new int[255];
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			freq[ch]++;
		}
		boolean printed[]=new boolean[255];
		for(int i=0;i<str.length();i++)
		{
//			if(freq[i]==1)	
//			{
//				System.out.println("first non repeating char  "+(char)i );
//				break;
//			}
			 char ch = str.charAt(i);
	            if (!printed[ch]) {
	                System.out.println(ch + " : " + freq[ch]);
	                printed[ch] = true;
	}
	

}
	}
}
