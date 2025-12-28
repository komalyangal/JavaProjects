import java.io.*;

class Bufferwrite
{
	public static void main(String [] arg)
	{
		try
		{
			String text="I am going to transfer to buffer";
			File f=new File("buffer.txt");
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(text);
			bw.close();
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			int c;
			while((c=br.read())!=-1)
			{
				System.out.print((char)c);
			}
			br.close();
			
			
			
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	}
}