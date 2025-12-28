import java.io.*;
import java.util.Scanner;
class Copyfile
{
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		try{
		System.out.println("Enter the input file name ");
		String inputf=sc.next();
		System.out.println("Enter the output file name ");
		String outputf=sc.next();
		FileInputStream fis=new FileInputStream(inputf);
		FileOutputStream fos=new FileOutputStream(outputf);
		byte []buffer=new byte[1024];
		int bread;
		while((bread=fis.read(buffer))!=-1)
		{
			fos.write(buffer,0,bread);
		}
		fos.close();
		fis.close();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}	
	}
}
