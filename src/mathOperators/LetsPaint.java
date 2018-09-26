package mathOperators;
import java.util.Scanner;
public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
int length=-999;
int width=-999;
int wall1=-999;
int wall2=-999;
double paintneeded=-999;
double walltotal=-999;
System.out.println("What is the length of the room?");
length= input.nextInt();
System.out.println("What is the width of the room?");
width= input.nextInt();
wall1= length*8;
wall2= length*8;
walltotal= wall1 + wall1+ wall2+wall2;
paintneeded= walltotal/150;
System.out.println("The dimensions of the room are " + length + "x" + width);
System.out.println("The area of wall space is "+ walltotal);
System.out.println("You need " + Math.ceil(paintneeded) + "gallons of paint");

	}

}