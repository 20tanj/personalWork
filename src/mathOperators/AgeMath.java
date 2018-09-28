package mathOperators;
import java.util.Scanner;
public class AgeMath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = -999;
Scanner input = new Scanner(System.in);
System.out.println("How many years old are you?");
age= input.nextInt();
age = age + 7;
System.out.println("You will be " + age + " years old in seven years.");

	}

}