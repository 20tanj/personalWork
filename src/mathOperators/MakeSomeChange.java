package mathOperators;
import java.util.Scanner;
public class MakeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
double change=-999.0;

double dollars=-999.0;
double quarters=-999.0;
double dimes=-999.0;
double nickels=-999.0;
double pennies=-999.0;
System.out.println("What amount are you making change for?");
change= input.nextDouble();
System.out.println("You are breaking down " + change);
dollars=(int)change/1;
change%=1;
quarters=(change/0.25);
change%=0.25;
dimes=change/0.1;
change%=0.1;
nickels=change/0.05;
change%=0.05;
pennies=change/0.01;
change%=0.01;
System.out.println("You need " + (int)dollars + "dollars");
System.out.println("You need " + (int)quarters + "quarters");
System.out.println("You need " + (int)dimes + "dimes");
System.out.println("You need " + (int)nickels + "nickels");
System.out.println("You need " + (int)pennies + "pennies");
	}

}