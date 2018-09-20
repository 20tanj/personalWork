package inputExamples;
import java.util.Scanner;
public class LockerCombination {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstnumber = -999;
Scanner input = new Scanner(System.in);
System.out.println("What's the first number of your locker combo?");
firstnumber= input.nextInt();
int secondnumber = -999;
System.out.println("What's the second number of your locker combo?");
secondnumber =input.nextInt();
int thirdnumber = -999;
System.out.println("What's the third number of your locker combo?");
thirdnumber =input.nextInt();
System.out.println("Your locker combo is " +firstnumber+"-"+secondnumber+"-"+thirdnumber);


	}

}