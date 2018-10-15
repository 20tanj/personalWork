package objectOrientated;
//import statements at the top

public class Circle {

	//instance fields - data storage
	private double radius;
	// constructors- methods for constructing the object
	
	//default constructor

	public Circle() {
	//Statements to initialize the state of the object
		radius=3.0;
	}

	public Circle(double newRadius1)
	{
		radius=newRadius1;
	}
	
//methods- things the object can do
	
public double getCircumference()
{
	return 2* radius * Math.PI;
}
public double area()
{
	return Math.PI * radius * radius;
}
public void setRadius(double newRadius)
{
	radius= newRadius;
}
	}
