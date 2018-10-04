package objectOrientated;
//import statements at the top
import java.util.Scanner;
public class RoomClass {

	//instance fields - data storage
	
	// constructors- methods for constructing the object
	
	//default constructor
	public RoomClass() {
	//Statements to initialize the state of the object
	}
//methods- things the object can do
public void area()
{
Scanner input= new Scanner(System.in);
int length=-999;
int width= -999;
int area=-999;
length=input.nextInt();
width=input.nextInt();
area= width*length;
System.out.println("The area of the wall is " + area);
}
public void areawithDoor()
{
Scanner input= new Scanner(System.in);
int length=-999;
int width =-999;
int lengthdoor=-999;
int widthdoor=-999;
int areaofwall=-999;
int areaofdoor=-999;
int areawithout=-999;
areaofwall= length*width;
areaofdoor= areaofwall*areaofdoor;
areawithout= areaofwall-areaofdoor;

}
}


