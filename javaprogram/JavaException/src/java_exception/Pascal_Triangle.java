package java_exception;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=5;
		for(int line=0;line<r;line++)
		{
			int v=1;
			for(int s=0;s<r-line;s++)
			{
				System.out.print(" ");
			}
			for(int i=0;i<=line;i++)
			{
				System.out.print(v+" ");
				v=v*(line-i)/(i+1);
			}
			System.out.println();

		}
	}

}
