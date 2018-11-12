package strings;

import java.util.Scanner;

public class PrimitiveThenStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

System.out.println("Age?");
double age=input.nextDouble();
input.nextLine();
System.out.println("Name?");
String name= input.next();
System.out.println(name + " " + age);
	}

}
