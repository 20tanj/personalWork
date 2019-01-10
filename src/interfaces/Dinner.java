package interfaces;

public class Dinner implements Meal {
	private String protein;
	private String dessert;
	private int calories;

	public Dinner()
	{
		protein="lots";
		dessert="cake";
		calories=100;
	}
	public Dinner(String xprotein, String xdessert, int xcalories)
	{
		protein= xprotein;
		dessert=xdessert;
		calories=xcalories;
	}
	public String forDessert()
	{
	 return dessert;
	}

	public int getCalories()
	{
		return calories;
	}

	public String toString()
	{
		return "Dinner Object: Protein =" + protein + "dessert =" + dessert + "calories=" + calories;
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
		return new Dinner(protein, dessert, calories);
	}


	}




