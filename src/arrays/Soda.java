package arrays;

public class Soda {
double radius;
double height;

public Soda(double xradius, double xheight)
{
	radius=xradius;
	height=xheight;
}
public String toString()
{
	return "Soda Object: radius=" + radius +"height="+ height;
	
}
public boolean equals(Object one, Object two)
{
	if(one.toString().equals(two.toString()))
	{
		return true;
	}
	else
	{
		return false;
	}
}
public Object clone()
{
	return new Soda(radius, height);
}
}
