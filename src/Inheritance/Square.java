package Inheritance;

public class Square extends Rectangle{

public Square()
{
	super();
}
public Square(double xs1)
{
	super(xs1,xs1);
}
public String toString()
{
	return "Square:" +super.toString();
}
public boolean equals(Object otherObject)
{
	return (this.toString().equals(otherObject.toString()));
}
public Object clone()
{
	return new Square(super.getSide1());
}
}
