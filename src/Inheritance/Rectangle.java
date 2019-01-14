package Inheritance;

public class Rectangle extends Parallelogram implements Geo {

public Rectangle()
{
	super();
}
public Rectangle(double xs1, double xs2)
{
super(xs1, xs2, xs1);
}
public String toString()
{
	return"Rectangle:" +super.toString();
}
public boolean equals(Object otherObject)
{
	return (this.toString().equals(otherObject.toString()));
}
public Object clone()
{
	return new Rectangle(super.getSide1(),super.getSide2());
}
}
