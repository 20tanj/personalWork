package Inheritance;
//import statements at the top

public class Cat implements Comparable<Cat>{

	//instance fields - data storage
	private int age;
	private double sleep;
	// constructors- methods for constructing the object
	
	//default constructor

	public Cat() {
	//Statements to initialize the state of the object
		age=5;
		sleep=5.0;
	}
	public Cat(int newAge, double newSleep)
	{
	age=newAge;
	sleep=newSleep;
	}

//methods- things the object can do
	public int compareTo(Cat xPerson)
	{
		if((Math.abs(this.age-xPerson.getAge())<0.001))
		{
			return 0;
		}
		if(this.age>xPerson.getAge())
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
public int getAge()
{
	return age;
}
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