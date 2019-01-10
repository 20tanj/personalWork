package interfaces;
import java.util.ArrayList;
public class MealTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Meal> meal= new <Meal>ArrayList();
int totaleggs=0;
meal.add(new Breakfast());
meal.add(new Lunch());
meal.add(new Dinner());

for(Meal x: meal)
{
	if(x instanceof Breakfast)
	{
		Breakfast bob= (Breakfast)x;
		if(bob.getEggs()==true)
		{
			totaleggs++;
		}
	}
}
System.out.println(totaleggs);
	}

}
