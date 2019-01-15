package Inheritance;

public class Car extends Auto{
private int cupHolders;
public Car(int xodometer, int xmpg, int xcupHolders)
{
	super(xodometer, xmpg);
	cupHolders=xcupHolders;
}
public int getCupHolders()
{
	return cupHolders;
}
}
