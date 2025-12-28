package java_exception;

import java.util.Scanner;

public class Remove_duplicates_string {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(sb.indexOf(String.valueOf(ch))==-1)
				sb.append(ch);
				
		}
		System.out.println(sb);
	}

}
