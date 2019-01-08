package interfaces;

public class Lunch implements Meal {

	private boolean school;
	private int prepTime;
	private int calories;

	public Lunch()
	{
		school=true;
		prepTime=10;
		calories=100;
	}
	public Lunch(boolean xschool, int xprepTime, int xcalories)
	{
		school=xschool;
		prepTime=xprepTime;
		calories=xcalories;
	}
	public boolean hadEggs()
	{
	 return true;
	}

	public int getCalories()
	{
		return calories;
	}

	public String toString()
	{
		return "Lunch Object: School =" + school + "dprepTime =" + prepTime + "calories=" + calories;
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
		return new Lunch(school, prepTime, calories);
	}


	}


