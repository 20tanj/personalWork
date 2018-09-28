package mathOperators;
import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
int speedlimit=-999;
int driversspeed=-999;
int costofticket=-999;
System.out.println("What is the speed limit of the area the ticket was given");
speedlimit= input.nextInt();
System.out.println("How fast was the driver going?");
driversspeed= input.nextInt();
costofticket= driversspeed-speedlimit;
System.out.println("The driver was going " + driversspeed + " mph" + " The speed limit was " +speedlimit+ " mph" +" The cost of your ticket is " + costofticket+ " dollars");
	}

}
