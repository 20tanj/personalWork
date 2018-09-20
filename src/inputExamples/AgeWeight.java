package inputExamples;
import java.util.Scanner;
public class AgeWeight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = -999;
Scanner input = new Scanner(System.in);
System.out.println("How many years old are you?");
age= input.nextInt();
System.out.println("You are" + " " +age+ " " + "years old");
int weight = -999;
System.out.println("How many pounds do you weight?");
weight =input.nextInt();
System.out.println("You weigh"+" "+ weight +" "+ "pounds");
if(weight>250){
	System.out.println("cool");
}
else if(weight<100){
System.out.println("ok");
}
	}

}