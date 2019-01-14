package Inheritance;

public class Parallelogram extends Quad{
	private double height;
public Parallelogram()
{
	super.setSide1(10);
	super.setSide2(10);
	super.setSide3(10);
	super.setSide4(10);
	height=10;
}
public Parallelogram(double xs1, double xs2, double ht)
{
	super(xs1, xs2, xs1, xs2);
	height=ht;
}
public double area()
{
	return super.getSide4()*height;
}
public String toString()
{
	return "Parallelogram Object: height"+height+super.toString();
}
public boolean equals(Object otherObject)
{
	return (this.toString().equals(otherObject.toString()));
}
public Object clone()
{
	return new Parallelogram(super.getSide1(),super.getSide2(), height);
}
}
