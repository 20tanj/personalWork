package objectOrientated;
//import statements at the top

public class IsoscelesTrapezoid {

	//instance fields - data storage
	private double base1;
	private double base2;
	private double height;
	private double leg;
	// constructors- methods for constructing the object
	
	//default constructor

	public IsoscelesTrapezoid() {
	//Statements to initialize the state of the object
		base1=3.0;
		 base2=3.0;
		 height=3.0;
		 leg=3.0;
	}
	public IsoscelesTrapezoid(double newBase1, double newBase2, double newHeight, double newLeg)
	{
	base1=newBase1;
	base2=newBase2;
	height=newHeight;
	leg=newLeg;
	}

//methods- things the object can do
public double perimeter()
{
	return base1+base2+leg+leg;
}
public double area()
{
	return ((base1*base2)/2)*height;
}
	}