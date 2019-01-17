package objectOrientated;
//import statements at the top

public class Worker implements Comparable<Worker>{

	//instance fields - data storage
	private int hours;
	private double rate;
	// constructors- methods for constructing the object
	
	//default constructor

	public Worker() {
	//Statements to initialize the state of the object
		hours=5;
		rate=5.0;
	}
	public Worker(int newHours, double newRate)
	{
	hours=newHours;
	rate=newRate;
	}

//methods- things the object can do
public double payCheck()
{
	return hours*rate;
}
public void raise(double raiseamount)
{
	rate=rate+raiseamount;
}
public double getRate()
{
	return rate;
}

public int compareTo(Worker xPerson)
{
	if((Math.abs(rate-xPerson.getRate())<0.001))
	{
		return 0;
	}
	if(this.rate>xPerson.getRate())
	{
		return -1;
	}
	else
	{
		return 1;
	}
}
	}