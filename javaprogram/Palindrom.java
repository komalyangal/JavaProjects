import java.util.Scanner;
class check
{
	int top=-1;
	String pali,words[];
	char arr[],res[];
	char ch;
	void countp(String text1)
	{
		words=text1.split("\\s+");
		int count=0;
		for(String word :words)
		{
			int f=ispalindrom(word);
			if(f==1)
				count++;
			
		}
		System.out.println("No.of palindrom "+count);
	}	
	int ispalindrom(String text)
	{
		top=-1;
		pali=text;
		arr=new char [text.length()];
		res=new char [text.length()];

		for(int i=0;i<arr.length;i++)
		{
			ch=text.charAt(i);
			push(ch);
		}
		for(int i=0;i<res.length;i++)
			res[i]=pop();

		 int flag=1;
		 for (int i = 0;i<res.length;i++) 
		 {
			if(res[i]!=pali.charAt(i)){
				flag=0;
				break;
			}
		}
					
		return flag;	
	}
	void push(char ch)	
	{
		arr[++top]=ch;
	}	
	char pop()
	{
		return arr[top--];
	}
}
class Palindrom
{
	public static void main(String [] arg)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		str=sc.nextLine();
		check c=new check();
		c.countp(str);		
	}
}
