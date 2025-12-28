package java_exception;

public class Replacevowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="komal yangal ";
		StringBuilder sb=new StringBuilder(str);
		for(int i=0;i<sb.length();i++){
			char ch=str.charAt(i);
			if(isVowel(ch))
			{
				sb.setCharAt(i,'*');
			}
		}
		System.out.println("modified string "+sb);
	}
	public static boolean isVowel(char ch)
	{
		return "AEIOUaeiou".indexOf(ch)!=-1;
	}

}
