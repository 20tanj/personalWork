package objectOrientated;
//import statements at the top

public class Employee {

	//instance fields - data storage
	private double wage;
	private double experience;
	// constructors- methods for constructing the object
	
	//default constructor
	
	public Employee() {
	//Statements to initialize the state of the object
		wage=16;
		experience=5;
	}

//methods- things the object can do
	public double getWage(){
		return wage;
	}
	public void setWage(double newWage){
		wage= newWage;
	}
	public double getExperience(){
		return experience;
	}
	public void setExperience(double newExperience){
		experience= newExperience;
	}
	public void setRaiseWage(double currentWage){
		wage= currentWage+(currentWage/10);
	}
	}