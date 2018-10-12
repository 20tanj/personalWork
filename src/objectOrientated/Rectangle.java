package objectOrientated;
//import statements at the top

public class Rectangle {

	//instance fields - data storage
	private double length;
	private double width;
	// constructors- methods for constructing the object
	
	//default constructor

	public Rectangle() {
	//Statements to initialize the state of the object
		length=5.0;
		width=5.0;
	}
	public Rectangle(double newLength, double newWidth)
	{
	length= newLength;
	width= newWidth;
	}

//methods- things the object can do
	public double returnLength()
	{
		return length;
	}
public double returnWidth()
{
	return width;
}
public double returnPerimeter()
		{
	return length+length+width+width;
		}
public double returnArea()
{
	return length*width;
}
public void changeLength(double newLength)
{
	length=newLength;
}
public void changeWidth(double newWidth)
{
	width=newWidth;
}
	}
