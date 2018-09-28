package mathOperators;
import java.util.Scanner;
public class Trip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
int distanceoftrip=-999;
int fueleconomy=-999;
int costofgas=-999;
int gallonsused=-999;
int costpergallon=-999;
System.out.println("What was the distance of the trip?");
distanceoftrip= input.nextInt();
System.out.println("What is the fuel economy of the car (MPG)?");
fueleconomy= input.nextInt();
System.out.println("How much money was spent on gas?");
costofgas= input.nextInt();
gallonsused= distanceoftrip/fueleconomy;
costpergallon= costofgas/gallonsused;
System.out.println("You traveled a total distance of " + distanceoftrip);
System.out.println("You used this many gallons "+gallonsused);
System.out.println("The total amount spent of gas is " +costofgas);
System.out.println("The average cost per gallon of gas is "+costpergallon);


	}

}
