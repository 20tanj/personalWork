package Inheritance;

public class Rectangle extends Quad {

public Rectangle()
{
	Quad bob=new Quad();
	bob.setSide1(10);
	bob.setSide2(10);
	bob.setSide3(20);
	bob.setSide4(20);
}
public Rectangle(double xs1, double xs2)
{

	Quad bob=new Quad();
	bob.setSide1(xs1);
	bob.setSide2(xs1);
	bob.setSide3(xs2);
	bob.setSide4(xs2);
	}

public double area()
{
	Quad bob=new Quad();
	return bob.getSide1()*bob.getSide3();
}
	
}
