package objectOrientated;

public class NumbersTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ActivityNumbers num= new ActivityNumbers();
num.sayNumber(7.5);
num.sayNumberPlus2(7.5);
num.saySum(7.5, 7.5);
double squareanswer= num.returnSquare(7.0);
System.out.println(squareanswer);
double areaanswer=num.returnArea(7.0, 8.0);
System.out.println(areaanswer);
double roundupanswer=num.returnRoundUp(7.6);
System.out.println(roundupanswer);
	}

}
