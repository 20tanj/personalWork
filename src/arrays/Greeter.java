package arrays;
//import statements at the top

public class Greeter {

	//instance fields - data storage
	private int age;
	// constructors- methods for constructing the object
	
	//default constructor

	public Greeter() {
	//Statements to initialize the state of the object
		age=16;
	}
	public Greeter(int newAge) {
		//Statements to initialize the state of the object
			age=newAge;
		}
//methods- things the object can do
	
	public void sayHello()
	{
		System.out.print("Hello");
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int newAge)
	{
		age= newAge;
	}
	}
