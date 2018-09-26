package mathOperators;
import java.util.Scanner;
public class PullSSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
int age=-999;
int SSN=-999;
int lastfour=-999;
double yearsuntil=-999;
System.out.println("How many years old are you?");
age= input.nextInt();
System.out.println("What is your social security number?");
SSN= input.nextInt();
lastfour= SSN%10000;
yearsuntil= 18-age;
System.out.println("You are " +age+" years old");
System.out.println("You are "+yearsuntil+" years away from being 18");
System.out.println("Your SSN is "+ SSN);
System.out.println("The last four digits of your SSN is " + lastfour);
	}

}