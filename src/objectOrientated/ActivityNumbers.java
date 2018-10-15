package objectOrientated;
//import statements at the top

public class ActivityNumbers {

	//instance fields - data storage
	
	// constructors- methods for constructing the object
	
	//default constructor
	public ActivityNumbers() {
	//Statements to initialize the state of the object
	}
//methods- things the object can do
public void sayNumber(double num)
{
	System.out.println("Your number is:" + num);
}
public void sayNumberPlus2(double num)
{
	System.out.println("Your number is:" + (num+2.0));
}
public void saySum(double num1, double num2)
{
	
	System.out.println("Your number is:"+(num1 +num2));
}
public double returnSquare(double num1)
{
	double num2=(num1*num1);
	return num2;
}
public double returnArea(double length, double width)
{
	double area= length*width;
	return area;
}
public double returnRoundUp(double num)
{
	double num2=Math.ceil(num);
	return num2;
}
}
