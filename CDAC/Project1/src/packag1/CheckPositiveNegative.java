package packag1;
import java.util.*;
public class CheckPositiveNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
	
		if(a<0)
			System.out.println("Number is Negative");
		else
			System.out.println("Number is Positive");

	}

}
