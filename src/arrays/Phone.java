package arrays;

public class Phone {
private static int companyproductnumber=0;
private int productNumber;
private int myNumber;
final static private int maxMinutes=10000;
private int minutesUsed;
	public Phone(int newMyNumber, int newminutesUsed)
	{
		myNumber=newMyNumber;
		minutesUsed=newminutesUsed;
		productNumber=companyproductnumber;
		companyproductnumber=companyproductnumber+1;
	}
	public void makeCall(int minutes)
	{
		minutesUsed=minutesUsed+minutes;
	}
	public int timeRemaining()
	{
		return maxMinutes-minutesUsed;
	}
	public void reset()
	{
		minutesUsed=0;
	}
	public Object clone()
	{
		return new Phone(myNumber, minutesUsed);
	}
	public String toString()
	{
		return "Phone object: myNumber=" + myNumber + "minutesUsed="+ minutesUsed;
	}
	public boolean equals(Object one, Object two)
	{
		if(one.toString().compareTo(two.toString())==0)
		{
		return true;
		}
		else
		{
		return false;
		}
		
	}
}
