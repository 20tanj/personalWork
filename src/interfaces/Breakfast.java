package interfaces;

public class Breakfast implements Meal{
private boolean eggs;
private String drink;
private int calories;

public Breakfast()
{
	eggs=true;
	drink="Coke";
	calories=100;
}

public Breakfast(Boolean e, String d, int c)
{
	eggs=e;
	drink=d;
	calories=c;
}

public boolean getEggs()
{
	return eggs;
}

public int getCalories()
{
	return calories;
}

public String toString()
{
	return "Breakfast Object: eggs =" + eggs + "drink =" + drink + "calories=" + calories;
}

public boolean equals(Object anObject)
{
	if(this.toString().equals(anObject.toString()))
	{
		return true;
	}
	else
	{
		return false;
	}
}

public Object clone()
{
	return new Breakfast(eggs, drink, calories);
}


}
