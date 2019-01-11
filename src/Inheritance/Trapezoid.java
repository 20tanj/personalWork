package Inheritance;

public class Trapezoid extends Quad implements Geo{
	private double height;
public Trapezoid()
{
	super();
	height=10;
}
public Trapezoid(double xs1, double xs2, double xs3, double xs4, double ht)
{
	super(xs1,xs2, xs3, xs4);
	height=ht;
}
public double area()
{
	return ((super.getSide4()*super.getSide2())/2)*height;
}
}
