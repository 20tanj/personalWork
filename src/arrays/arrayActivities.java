package arrays;

import java.util.Scanner;
import java.util.Random;

public class arrayActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		// Activity 1
		/*
		 * int[] scores= new int[5]; for(int i=0; i<scores.length; i++) {
		 * System.out.println("Give test score"); scores[i]=input.nextInt(); }
		 */

		// Activity 2
		/*
		 * int total=0; int[] scores= new int[5]; for(int i=0; i<5; i++) {
		 * System.out.println("Give test score"); scores[i]=input.nextInt();
		 * total+=scores[i]; } System.out.println(total); }
		 */

		// Activity 3
		/*
		 * int total=0; int[] scores= new int[25000]; for(int i=0; i<25000; i++)
		 * { System.out.println("Give test score"); scores[i]=input.nextInt();
		 * total+=scores[i]; } System.out.println(total);
		 */

		// Activity 4
		/*
		 * int[] scores= new int[5]; for(int i=0; i<5; i++) {
		 * System.out.println("Give test score"); scores[i]=input.nextInt();
		 * 
		 * } for(int j=4; j>=0; j--) { System.out.print(scores[j]); }
		 */

		// Activity 5
		/*
		 * Random test=new Random(23); int max= 1000; int min= 0; int largest=0;
		 * int side=min+ test.nextInt(max-min+1); int[] scores= new int[250];
		 * for(int i=0; i<250; i++) {
		 * 
		 * scores[i]=side; if(scores[i]>largest) {ssssss largest=scores[i]; }
		 * 
		 * } System.out.println(largest);
		 */

		// Activity 6
		/*
		 * String[] scores= new String[5]; for(int i=0; i<scores.length; i++) {
		 * System.out.println("Type a name"); scores[i]=input.nextLine(); }
		 * System.out.println("Give a letter"); String letter= input.nextLine();
		 * char newLetter= letter.charAt(0); for(int j=0; j<scores.length; j++)
		 * { int nameLength= scores[j].length(); char letterinput=
		 * scores[j].charAt(nameLength-1); if(newLetter==letterinput) {
		 * System.out.println(scores[j]); } }
		 */

		// Activity 7
		/*
		 * String[] scores= new String[5]; for(int i=0; i<scores.length; i++) {
		 * System.out.println("Type a name"); scores[i]=input.nextLine(); }
		 * System.out.println("Length"); int prefer= input.nextInt(); int
		 * total=0; for(int j=0; j<scores.length; j++) {
		 * if(scores[j].length()==prefer) { total++; } }
		 * System.out.println(total);
		 */

		// One Dimensional Arrays of Objects
		/*
		 * Rectangle[] rectangle2= new Rectangle[100]; int min= 10; int max=56;
		 * int min2= 10; int max2=56; int smallest=3136; int smallestindex=0;
		 * for(int i=0; i<rectangle2.length; i++) { int side=min+
		 * generator.nextInt(max-min+1); int side2=min2+
		 * generator.nextInt(max2-min2+1); rectangle2[i]=new Rectangle(side,
		 * side2); } for(int j=0; j<rectangle2.length; j++) {
		 * System.out.println(rectangle2[j].getLength());
		 * System.out.println(rectangle2[j].getWidth());
		 * System.out.println(rectangle2[j].area()); } for(int k=0;
		 * k<rectangle2.length; k++) { if(rectangle2[k].area()<smallest) {
		 * smallest=rectangle2[k].area(); smallestindex=k; }
		 * 
		 * }
		 */
		/*
		 * Friend[] friend2= new Friend[5]; for(int i=0; i<friend2.length;i++) {
		 * int age= input.nextInt(); String name= input.nextLine();
		 * 
		 * friend2[i].setAge(age); friend2[i].setName(name);
		 * 
		 * } for(int j=friend2.length-1; j>0; j--) {
		 * System.out.println(friend2[j].getName());
		 * System.out.println(friend2[j].getAge()); }
		 */

		// Split Method Activity
		/*
		 * String sentence = input.nextLine(); String keyword= input.nextLine();
		 * String[] first = sentence.split(" "); int total=0; for (int i = 0; i
		 * < first.length; i++) { if(first[i].equalsIgnoreCase(keyword)==true) {
		 * total++; } } System.out.println(total);
		 */
		/*
		 * String sentence = input.nextLine(); String[] first =
		 * sentence.split(" "); int max= first.length-1; int min= 0; int
		 * side=min+ generator.nextInt(max-min+1);
		 * System.out.println(first[side]);
		 */
		/*
		 * int row=23; int column=9; int min=0; int max=100; int sum=0; int [][]
		 * numbers= new int [row][column]; for(int i=0; i<numbers.length; i++) {
		 * for(int j=0; j<numbers[0].length;j++) { int side=min+
		 * generator.nextInt(max-min+1); numbers[i][j]=side; sum+=
		 * numbers[i][j]; }
		 * 
		 * } System.out.println(sum);
		 */
		/*
		 * int row=3; int column=7; int third=9; int min=0; int max=50;
		 * 
		 * int [][][] numbers= new int [row][column][third]; for(int i=0;
		 * i<numbers.length; i++) { for(int j=0; j<numbers[0].length;j++) {
		 * for(int k=0; k<numbers[0][0].length;k++) { int side=min+
		 * generator.nextInt(max-min+1); numbers[i][j][k]=side; } }
		 * 
		 * }
		 */
		/*
		 * int row=4; int column=3;
		 * 
		 * 
		 * String [][] numbers= new String [row][column]; for(int i=0;
		 * i<numbers.length; i++) { for(int j=0; j<numbers[0].length;j++) {
		 * System.out.println("give name"); numbers[i][j]=input.nextLine();
		 * 
		 * } } for(int i=0; i<numbers.length; i++) { for(int j=0;
		 * j<numbers[0].length;j++) {
		 * 
		 * System.out.print(numbers[i][j]+" ");
		 * 
		 * } System.out.println(); }
		 */
		int row = 18;
		int column = 5;
		int min = 0;
		int max = 100;

		Friend[][] numbers = new Friend[row][column];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				numbers[i][j] = new Friend();

			}
		}
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				int side = min + generator.nextInt(max - min + 1);
				numbers[i][j].setAge(side);

			}
		}
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				System.out.println(numbers[i][j].getAge());

			}
		}
	}
}
