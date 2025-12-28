package com.dkte;

import java.util.Scanner;


class ExceptionLineTooLong
{
	String text;
	public ExceptionLineTooLong(String text)
	{
		this.text=text;
	}
	int CalLength()
	{
		return text.length();
	}
}
public class AssignmentNo_7 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the text ");
			String text=sc.nextLine();
			ExceptionLineTooLong e=new ExceptionLineTooLong(text);
			if(e.CalLength()>80)
			{
				throw new "ExceptionLineTooLong ";
			}
		}
		catch(Exception e)
		{
			
		}
	}

}
