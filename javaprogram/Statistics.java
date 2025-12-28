package mypack;
import java.util.Arrays;
public class Statistics
{	
	double meanvalue;
	public double calculateMean(int [] data)
	{
		double sum=0.0;
		for(int i:data)
		{
			sum=sum+i;
		}
		meanvalue=sum/data.length;
		return meanvalue;
	}
	public double calculateMedian(int [] data)
	{
		int middleval;
		Arrays.sort(data);
		//for(int i:data)
		//	System.out.println(i+" ");
		middleval=data.length/2;
		if(data.length%2==0)	
		{
			return (data[middleval-1]+data[middleval])/2;
		}
		else
			return data[middleval];
		
	}
	public int calculateMode(int [] data)
	{
		int mode=data[0];
		int maxc=0;
		if(data.length==0)
			throw new IllegalArgumentException("the array cannot be empty");
		for(int i=0;i<data.length;i++)
		{
			int count=0;
			for(int j=0;j<data.length;j++)
			{
				if(data[i]==data[j])
					count++;
			}
			if(count>maxc)
			{
				maxc=count;
				mode=data[i];
			}

		}
		if(maxc>1)
			return mode;
		else
			return -1;
	
	}
	public double calStandardDeviation(int [] data)
	{
		double sum=0.0;
		for(int i:data)
		{
			sum+=Math.pow(i-meanvalue,2);
		}
		return Math.sqrt(sum/data.length);
	}

}