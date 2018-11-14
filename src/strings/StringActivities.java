package strings;

import java.util.Scanner;

public class StringActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Activity 1
		/*
		 * System.out.println("Give a sentence"); String sentence=
		 * input.nextLine(); System.out.println(sentence.charAt(0));
		 * System.out.println(sentence.charAt(2)); System.out.println(sentence);
		 */

		// Activity 2
		/*
		 * System.out.println("Give a sentence"); String sentence=
		 * input.nextLine(); System.out.println(sentence.contains("bob"));
		 */

		// Activity 4
		/*
		 * System.out.println("Give a sentence"); String sentence=
		 * input.nextLine(); System.out.println(sentence.indexOf("X"));
		 */

		// Activity 5
		/*
		 * System.out.println("Give a sentence"); String sentence=
		 * input.nextLine(); System.out.println(sentence.length());
		 */

		// Activity 6
		/*
		 * System.out.println("Give a sentence"); String sentence=
		 * input.nextLine();
		 * 
		 * for(int character=0; character<=sentence.length(); character++) {
		 * System.out.println(sentence.charAt(character)); }
		 */
		/*
		 * String text="My name is Buzz Lightyear!"; for(int i=1;
		 * i<text.length();i++) { System.out.println(text.substring(0,i)); }
		 */

		// Activity 7
		/*
		 * System.out.println("Give a sentence"); String sentence=
		 * input.nextLine(); System.out.println(sentence.toLowerCase());
		 * System.out.println(sentence);
		 */

		// Activity 8
		/*
		 * System.out.println("Give a sentence"); String sentence=
		 * input.nextLine(); System.out.println("Give a sentence"); String
		 * sentence2= input.nextLine();
		 * if(sentence.compareToIgnoreCase(sentence2)<0) {
		 * System.out.println(sentence.toUpperCase()); } else {
		 * System.out.println(sentence2.toUpperCase()); }
		 */

		// Activity 10
		/*
		 * System.out.println("Give a password"); String sentence=
		 * input.nextLine(); System.out.println("Verify Password"); String
		 * sentence2=input.nextLine(); while(!sentence.equals(sentence2)) {
		 * System.out.println("Give a password"); sentence= input.nextLine();
		 * System.out.println("Verify Password"); sentence2=input.nextLine(); }
		 */

		// Activity 11
		/*
		 * System.out.println("Give a sentence"); String sentence=
		 * input.nextLine();
		 * 
		 * for(int character=0; character<sentence.length();
		 * character=character+4) {
		 * System.out.println(sentence.charAt(character));
		 * 
		 * }
		 */

		// Activity 12
/*
		System.out.println("Give a sentence");
		String sentence = input.nextLine();

		for(int j=0;j<sentence.length(); j++)
		{
			if(sentence.charAt(j) != 'a' && sentence.charAt(j)!= ' ')
		{
	System.out.print(sentence.charAt(j));
		}
		}
		*/
		
		//Activity 13
		
		System.out.println("Give SSN");
		String sentence = input.nextLine();
		
		for(int counter=5; counter<sentence.length(); counter++)
		System.out.print(sentence.charAt(counter));
		
		for(int counter2=3; counter2<=4; counter2++)
			System.out.print(sentence.charAt(counter2));
		
		for(int counter3=0; counter3<=2; counter3++)
			System.out.print(sentence.charAt(counter3));
	}

}
