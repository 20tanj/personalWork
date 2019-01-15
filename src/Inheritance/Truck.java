package Inheritance;

public class Truck extends Auto {
private boolean fourWD;

public Truck(boolean xfourWD, int xodometer, int xmpg)
{
	super(xodometer, xmpg);
	fourWD=xfourWD;
}
public boolean getFourWd()
{
	return fourWD;
}
public String toString()
{
	return "Truck: fourWD=" + fourWD+"odometer="+super.getOdometer()+"mpg="+super.getMPG();
}
public boolean equals(Object anObject)
{
	if(this.toString().equals(anObject.toString()));
	{
		return true;
	}
}






}
