package objectOrientated;
//import statements at the top
import java.util.Scanner;
public class HomeClass {

	//instance fields - data storage
	
	// constructors- methods for constructing the object
	
	//default constructor
	public HomeClass() {
	//Statements to initialize the state of the object
	}
//methods- things the object can do
public void sayTime()
{
	Scanner input=new Scanner(System.in);
	int length=input.nextInt();
	int height=input.nextInt();
	int wallarea= length*height;
	int time= (wallarea/200)*60;
}
}