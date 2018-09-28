package mathOperators;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
int dividend=-999;
int divisor=-999;
int result=-999;
int answer=-999;
int remainder=-999;
System.out.println("What is the dividend of the equation?");
dividend= input.nextInt();
System.out.println("What is the divisor of the equation?");
divisor= input.nextInt();
answer= dividend/divisor;
remainder= dividend % divisor;
System.out.println("Your answer is " + answer + "r"+ remainder);
	}

}
