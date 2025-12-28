package mypack;
public class Trigonometry
{
	double Radianvalue,sinval,cosval,tanval;
	public double radianValue(double angle)
	{	
		Radianvalue=Math.toRadians(angle);
		return Radianvalue;
	}
	public double sinValue()
	{
		sinval=Math.sin(Radianvalue);
		return sinval ;
	}
	public double cosValue()
	{
		cosval=Math.cos(Radianvalue);
		return cosval; 
	}
	public double tanValue()
	{
		tanval=Math.tan(Radianvalue);
		return tanval;
	}
	public double secValue()
	{
		return 1/cosval;
	}
	public double cotValue()
	{
		return 1/tanval;
	}
	public double cosecValue()
	{
		return 1/sinval;
	}

}