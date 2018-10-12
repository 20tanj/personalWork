package objectOrientated;
//import statements at the top

public class RighTriangle {

	//instance fields - data storage
	private double base;
	private double height;
	// constructors- methods for constructing the object
	
	//default constructor

	public RighTriangle() {
	//Statements to initialize the state of the object
		base=3.0;
		height=4.0;
	}
	public RighTriangle(int newBase, double newHeight)
	{
	base=newBase;
	height=newHeight;
	}

//methods- things the object can do
public double hypot()
{
	return Math.hypot(base, height);
}
public double perimeter()
{
	return base+base+height+height;
}
public double area()
{
	return base*height;
}
	}