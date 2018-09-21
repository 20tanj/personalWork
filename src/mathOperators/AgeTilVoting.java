package mathOperators;
import java.util.Scanner;
public class AgeTilVoting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = -999;
Scanner input = new Scanner(System.in);
System.out.println("How many years old are you?");
age= input.nextInt();
age = 18 - age;
System.out.println("You can vote in " + age + " years");

	}

}