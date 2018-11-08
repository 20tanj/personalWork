package decisions;

import java.util.Random;
import java.util.Scanner;

public class ShoeActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random thing = new Random();
		// Age Activity
		/*
		 * System.out.println("What is your age?"); double age=
		 * input.nextDouble(); System.out.println(age==16);
		 */

		// Shoe Activity
		/*
		 * System.out.println("What is your shoe size?"); double shoesize=
		 * input.nextDouble(); System.out.println("What is your height?");
		 * double height= input.nextDouble();
		 * System.out.println(shoesize+height>=26);
		 */

		// Height and Shoe Activity
		/*
		 * System.out.println("What is your height?"); double height=
		 * input.nextDouble(); System.out.println("What is your shoe size?");
		 * double shoe= input.nextDouble(); System.out.println(height<62 &&
		 * shoe>9);
		 */

		// Pets and Garage Activity
		/*
		 * System.out.println("How many pets are in your house?"); double
		 * housecats= input.nextDouble();
		 * System.out.println("How many cats will fit in your garage?"); double
		 * garagecats= input.nextDouble(); System.out.println(housecats>=5 ||
		 * garagecats>3);
		 */

		// Activity
		/*
		 * System.out.println("What is the score of your first test?"); double
		 * firstscore= input.nextDouble();
		 * System.out.println("What is the score of your second test?"); double
		 * secondscore= input.nextDouble(); if(firstscore>secondscore) {
		 * System.out.println("Great Job"); }
		 * System.out.println(firstscore-secondscore);
		 * System.out.println("Have a nice day!");
		 */

		// Largest Activity
		/*
		 * int first=input.nextInt(); int second=input.nextInt(); int
		 * third=input.nextInt(); if(first>second && first>third) {
		 * System.out.println(first); }
		 * 
		 * if(second>first && second>third) { System.out.println(second); }
		 * 
		 * if(third>first && third>second) { System.out.println(third); }
		 */

		// Age Decision Activity
		/*
		 * System.out.println("State your age"); double age= input.nextDouble();
		 * if(age<=17) {
		 * System.out.println("You are getting an A in this class"); }
		 * System.out.println("I hope you are having a great day!");
		 */

		// Honors Activity
		/*
		 * System.out.println("What is your GPA?"); double gpa=
		 * input.nextDouble(); System.out.println("What class are you in?");
		 * double year= input.nextDouble(); if(gpa>=3.5 && year==2019) {
		 * System.out.println("Congrats you are honors"); } else {
		 * System.out.println("Sorry you are not honors"); }
		 */

		// Lucky Number Activity
		/*
		 * System.out.println("How old are you?"); double
		 * age=input.nextDouble();
		 * System.out.println("How tall are you in inches?"); double
		 * height=input.nextDouble();
		 * System.out.println("How much do you weight?"); double
		 * weight=input.nextDouble(); if(age>=18.0) {
		 * System.out.println(height*5); } else { System.out.println(weight/2);
		 * }
		 */

		// You Won! Activity
		/*
		 * System.out.
		 * println("How much money did you receieve to your fifth birthday?");
		 * double money=input.nextDouble();
		 * if(Math.abs(money-Math.sqrt(84.3))<0.1) {
		 * System.out.println("You won a good prize"); } else {
		 * System.out.println("You won a bad prize"); }
		 */

		// Salary Activity
		/*
		 * System.out.println("What is your yearly salary?"); double salary =
		 * input.nextDouble(); if (salary <= 20000) {
		 * System.out.println("You are a worker"); } else { if (salary <= 40000)
		 * { System.out.println("You are management"); } else { if (salary <=
		 * 100000) { System.out.println("You are a CEO"); } else {
		 * System.out.println("You are an owner"); }
		 * 
		 * } }
		 */

		// Grade Calculation Activity
		/*
		 * System.out.println("What is your test average?"); double test =
		 * input.nextDouble();
		 * System.out.println("What is your homework average?"); double homework
		 * = input.nextDouble(); System.out.
		 * println("Is your teacher nice? (Type 1 for yes, Type 2 for no)");
		 * double nice = input.nextDouble(); if (nice == 1) { if (test >
		 * homework) { System.out.println(test); } else {
		 * System.out.println(homework); } } else { if (test < homework) {
		 * System.out.println(test); } else { System.out.println(homework); } }
		 */

		// Temperature Activity
		/*
		 * System.out.println("What is the temperature?"); double temp =
		 * input.nextDouble(); if (temp > 83) {
		 * System.out.println("Go swimming"); } else { if (temp > 74) {
		 * System.out.println("Go play tennis"); } else { if (temp > 35) {
		 * System.out.println("Go play golf"); } else { if (temp > -10) {
		 * System.out.println("Go snow shoeing"); } else {
		 * System.out.println("Nothing"); } } } }
		 */

		// Test Scores Activity
		/*
		 * System.out.println("What is your test score?"); double first =
		 * input.nextDouble(); System.out.println("What is your test score?");
		 * double second = input.nextDouble();
		 * System.out.println("What is your test score?"); double third =
		 * input.nextDouble(); double average = (first + second + third) / 3; if
		 * (average > 92.5) { System.out.println("A"); } else { if (average >
		 * 84.5) { System.out.println("B"); } else { if (average > 77.5) {
		 * System.out.println("C"); } else { if (average > 69.5) {
		 * System.out.println("D"); } else { System.out.println("F"); } } } }
		 */

		// Weight Activity
		/*
		 * int number= input.nextInt(); switch(number) { case 37:
		 * System.out.println("Mercury"); break; case 88:
		 * System.out.println("Venus"); break; default:
		 * System.out.println("None"); }
		 */

		// Loop Activity (1-3)
		/*
		 * System.out.println("What is the end number?"); double
		 * number=input.nextDouble(); int count=0; while(count<=number) {
		 * System.out.println(count); count=count+2; }
		 */

		// Loop Activity (4-6)
		/*
		 * System.out.println("What is your number number?"); double
		 * number=input.nextDouble(); double sum=0; while(number!=9999) {
		 * sum=sum+number; System.out.println("Please enter a new number");
		 * number=input.nextDouble(); } System.out.println("You have quit");
		 * System.out.println("The sum of the numbers you typed in was " + sum);
		 */

		// Loop Activity (7-8)
		/*
		 * System.out.println("What is your number number?"); double
		 * number=input.nextDouble(); double sum=0; double entered=0; double
		 * largest=0; while(number!=9999) {
		 * 
		 * if(number>largest) { largest=number; }
		 * 
		 * System.out.println("Please enter a new number (9999 to quit)");
		 * number=input.nextDouble(); } System.out.println("You have quit");
		 * System.out.println(largest);
		 */
		// Do While Loop Activity (1-
		/*
		 * System.out.println("Please enter a number"); double number =
		 * input.nextDouble(); double largest=0; double smallest=999.0; do {
		 * if(number>largest) { largest=number; } if(number<smallest) {
		 * smallest=number; } System.out.println("Please enter another number");
		 * number = input.nextDouble(); } while (number != 9999);
		 * System.out.println(largest-smallest);
		 */

		// For Loop Activity (1-6)

		/*
		 * for( int i = 1; i <=5 ; i=i+1){ for( int j= 1; j<=4; j=j+1){
		 * System.out.print(i*j);
		 * 
		 * }
		 * 
		 * 
		 * } }
		 */

		// Nested Loop Activity
		/*
		 * int count=0; int num=0; int divisor=0; int largest=0; int most=0;
		 * for(num=1;num<=1000; num++){ divisor=0; for(count=1;count<=num;
		 * count++){ if(num%count==0){ divisor++; if(divisor>most){
		 * most=divisor; largest=num; } } } } System.out.println(largest);
		 */

		// Activity Sum of Odd
		/*
		 * System.out.println("Please type a positive integer:"); int number=
		 * input.nextInt(); if(number<=0){ number=10; } int sum=0; for(int
		 * counter=1; counter<=number; counter=counter+2) { sum=sum+counter; }
		 * System.out.println(sum);
		 */

		// Activity Class Average
		/*
		 * int sum=0; int grade=0; System.out.println("How many students:"); int
		 * students=input.nextInt(); for(int counter=0;counter<students;
		 * counter=counter+1) { System.out.print("Enter Grade for student" +
		 * (counter+1) + ":" ); grade= input.nextInt(); sum= sum+grade; }
		 * System.out.println(sum/students);
		 */

		// Activity Factorial
		/*
		 * System.out.println("What number do you want the factorial for?"); int
		 * number= input.nextInt(); int factorial= 1; for(int counter=1;
		 * counter<=number; counter=counter+1){ factorial= factorial*counter; }
		 * System.out.println(factorial);
		 */

		// Activity Cash Register
		/*
		 * System.out.println("How many items?"); int items=input.nextInt(); int
		 * total=0; for (int counter=1; counter<=items; counter=counter+1) {
		 * System.out.println("Price of" + (counter) + "item"); int
		 * price=input.nextInt(); total=total +price; }
		 * System.out.println(total); int tax= (total/100)*5;
		 * System.out.println(tax); System.out.println(total+tax);
		 */

		// Activity Divisors
		/*
		 * System.out.println("Provide a positive integer:"); int
		 * number=input.nextInt(); int largest=0; for(int divisor=1;
		 * divisor<number; divisor= divisor+1) { if(number%divisor==0) {
		 * largest=divisor; } } System.out.println(largest);
		 */

		// Activity Prime Number
		/*
		 * System.out.println("Provide a positive integer:"); int number=
		 * input.nextInt(); for(int counter=1; counter<=number;
		 * counter=counter+1) { if(number%counter==0) {
		 * System.out.println("Not Prime"); } else {
		 * System.out.println("Prime");
		 * 
		 * } }
		 */

		// Number Output Activity
		/*
		 * for (int counter = 1; counter <= 5; counter = counter + 1) { for (int
		 * counter2 = counter; counter2 <= 5; counter2 = counter2 + 1) {
		 * System.out.print(counter2);
		 * 
		 * } System.out.println(counter); }
		 */

		// Divisors Input
		/*
		 * System.out.println("Give a positive number:"); int number =
		 * input.nextInt(); int largestdivisor = 0; int largest = 0; int
		 * divisors = 0; for (int up = 1; up <= number; up = up + 1) { for (int
		 * counter = 1; counter <= up; counter = counter + 1) { if (up % counter
		 * == 0) { divisors = divisors + 1; } } if (divisors >= largestdivisor)
		 * { largestdivisor=divisors; largest = up;
		 * 
		 * } divisors = 0; }
		 * 
		 * System.out.println(largest);
		 */

		/*
		 * System.out.println("Give a radius"); double
		 * radius=input.nextDouble(); NewCircle sam= new NewCircle(radius); int
		 * i=1; do{ System.out.println(sam.getCircumfrance()); if(i<3) {
		 * System.out.println("Type another radius"); radius=
		 * input.nextDouble(); } i++;
		 * 
		 * }while (i<=3);
		 */
		/*
		 * System.out.println("Provide a positive integer"); int
		 * number=input.nextInt(); do{ int sum=0; for(int count=1;
		 * count<=number; count=count+1) { if(number%count==0) { if(count%2==0)
		 * { sum=sum+count; } } } System.out.println(sum);
		 * System.out.println("Provide a positive integer");
		 * number=input.nextInt(); }while(number!=9999);
		 */

		// low+(int)(Math.random()*(high-low+1))
		/*
		 * int low = 1; int high = 2; int sumheads = 0; int sumtails = 0; for
		 * (int counter = 1; counter <= 100000000; counter = counter + 1) { int
		 * random = low + (int) (thing.nextInt(high - low + 1)); if (random ==
		 * 1) { sumheads = sumheads + 1; } else { sumtails = sumtails + 1; } }
		 * System.out.println("Heads:" + sumheads + "Tails:" + sumtails);
		 */
		/*
		 * int low = 1; int high = 13; int total = 0; for (int counter = 1;
		 * counter <= 87; counter++) { int random = low + (int)
		 * (thing.nextInt(high - low + 1)); if (random % 3 == 0) { total++; }
		 * 
		 * } System.out.println(total);
		 */
		/*
		 * int low=26; int high=43; int total=0; for(int counter=1;
		 * counter<=248; counter++) { int random = low + (int)
		 * (thing.nextInt(high - low + 1)); if(random>36) total++; }
		 * System.out.println(total);
		 */
		// Roll a Die
		/*
		 * System.out.println("How many sides?"); int sides= input.nextInt();
		 * System.out.println("How many roles?"); int rolls= input.nextInt();
		 * int low= 1; int high= sides; for(int counter=1; counter<=rolls;
		 * counter=counter+1) { int random = low + (int) (thing.nextInt(high -
		 * low + 1)); System.out.println(random); }
		 */
		/*
		int low = 1;
		int high = 6;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
		System.out.println("How many rolls?");
		int rolls = input.nextInt();
		for (int counter = 1; counter <= rolls; counter = counter + 1) {
			int random = low + (int) (thing.nextInt(high - low + 1));
			if (random == 1) {
				sum1 = sum1 + 1;
			}
			if (random == 2) {
				sum2 = sum2 + 1;
			}
			if (random == 3) {
				sum3 = sum3 + 1;
			}
			if (random == 4) {
				sum4 = sum4 + 1;
			}
			if (random == 5) {
				sum5 = sum5 + 1;
			}
			if (random == 6) {
				sum6 = sum6 + 1;
			}
		}
		System.out.println(((double)sum1 / (double)rolls) * 100 + "%");
		System.out.println(((double)sum2 / (double)rolls) * 100 + "%");
		System.out.println(((double)sum3 / (double)rolls) * 100 + "%");
		System.out.println(((double)sum4 / (double)rolls) * 100 + "%");
		System.out.println(((double)sum5 / (double)rolls) * 100 + "%");
		System.out.println(((double)sum6 / (double)rolls) * 100 + "%");
		*/
		
		int low=1;
		int high=2;
		double head=0;
		double largest=0;
		for(int counter=1; counter<=100000; counter=counter+1)
		{
			for(int counter2=1; counter2<=1000; counter2=counter2+1)
			{
				int random = low + (int) (thing.nextInt(high - low + 1));
				if(random==1)
				{
					head++;
				}
			}
			if((head/1000)*100>=largest)
			{
				largest=(head/1000)*100;
			}	
			head=0;
		}
		System.out.println(largest);
	}
}
