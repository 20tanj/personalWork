package inputExamples;
import java.util.Scanner;
public class PasswordGenerator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstnumber = -999;
Scanner input = new Scanner(System.in);
System.out.println("What's a number of your password?");
firstnumber= input.nextInt();
int secondnumber = -999;
System.out.println("What's another number of your password?");
secondnumber =input.nextInt();
int thirdnumber = -999;
System.out.println("What's the final number of your password?");
thirdnumber =input.nextInt();
System.out.println("Your password can be...");
System.out.println(firstnumber+" " + secondnumber+" " + thirdnumber);
System.out.println(firstnumber+" "+thirdnumber+" "+secondnumber);
System.out.println(secondnumber+" "+thirdnumber+" "+firstnumber);
System.out.println(secondnumber+" "+firstnumber+" "+thirdnumber);
System.out.println(thirdnumber+" "+firstnumber+" "+secondnumber);
System.out.println(thirdnumber+" "+secondnumber+" "+firstnumber);

	}

}