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
}
