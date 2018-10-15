package objectOrientated;
//import statements at the top

public class Cat {

	//instance fields - data storage
	private double age;
	private double sleep;
	// constructors- methods for constructing the object
	
	//default constructor

	public Cat() {
	//Statements to initialize the state of the object
		age=5.0;
		sleep=5.0;
	}
	public Cat(double newAge, double newSleep)
	{
	age=newAge;
	sleep=newSleep;
	}

//methods- things the object can do
public void sleepMore(double newSleep)
{
	sleep=sleep+newSleep;
}
public void sleepLess(double newSleep)
{
	sleep=sleep-newSleep;
}
public double birthday()
		{
	return age+1;

		}
	}