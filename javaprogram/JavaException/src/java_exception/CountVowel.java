package java_exception;

import java.util.Scanner;

public class CountVowel {
	
	public static void count(String str)
	{
		int ac=0,ec=0,ic=0,oc=0,uc=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			switch(ch)
			{
			case 'a':
					ac++;
					break;
			case 'e':ec++;
					break;
			case 'i':ic++;break;
			case 'o':oc++;break;
			case 'u':uc++;break;
			
			}
		}
		System.out.println("a:"+ac);
		System.out.println("e:"+ec);

		System.out.println("i:"+ic);

		System.out.println("o:"+oc);

		System.out.println("u:"+uc);

		System.out.println("total  vowels are :"+ac+ic+oc+uc+ec);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine().toLowerCase();
		count(str);
	}

}
