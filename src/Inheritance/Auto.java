package Inheritance;

public class Auto {
private int odometer;
private int mPG;

public Auto()
{
odometer=0;
mPG=30;
}
public Auto(int xodometer, int xmpg)
{
	odometer=xodometer;
	mPG=xmpg;
}
public int getOdometer()
{
	return odometer;
}
public int getMPG()
{
	return mPG;
}
public void drive(int miles)
{
	if(miles>0)
	{
		odometer+=miles;
	}
	else
	{
		
	}
}
public String toString()
{
	return "Auto: odometer=" + odometer+ "MPG="+ mPG;
}
}
