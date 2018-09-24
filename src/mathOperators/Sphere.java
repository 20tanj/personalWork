package mathOperators;
import java.util.Scanner;
public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
int radius=-999;
double volume=-999.0;
System.out.println("What is the radius of the Sphere?");
radius= input.nextInt();
volume= Math.PI * radius * radius *radius / 0.75;
System.out.println("The volume of the sphere is " + volume);
	}

}
