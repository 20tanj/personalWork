package mathOperators;
import java.util.Scanner;
public class SumOfAges {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age1 = -999;
int age2 = -999;
int age3 = -999;
int sumage = -999;
Scanner input = new Scanner(System.in);
System.out.println("How many years old is the first person?");
age1= input.nextInt();
System.out.println("How many years old is the second person?");
age2= input.nextInt();
System.out.println("How many years old is the third person?");
age3= input.nextInt();
sumage= age1+age2+age3;
System.out.println("The sum of all of your ages is " + sumage);

	}

}