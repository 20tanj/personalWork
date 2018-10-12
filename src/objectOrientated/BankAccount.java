package objectOrientated;
//import statements at the top

public class BankAccount {

	//instance fields - data storage
	private double balance;
	private double accountnumber;
	private double interestrate;
	// constructors- methods for constructing the object
	
	//default constructor

	public BankAccount() {
	//Statements to initialize the state of the object
		balance=3.0;
		accountnumber=3.0;
		interestrate=3.0;
	}
	public BankAccount(int newBalance, double newAccountNumber, double newInterestRate)
	{
	balance=newBalance;
	accountnumber=newAccountNumber;
	interestrate=newInterestRate;
	}

//methods- things the object can do
public void deposit(double amount)
{
	balance=balance-amount;
}
public void withdraw(double amount)
{
	balance=balance-amount;
}
public void addInterest(double interest)
{
	balance= balance+((balance/100)*interest);
}
public void financeCharge(double charge)
{
	balance=balance-charge;
}
public void setInterest(double newInterest)
{
	interestrate=newInterest;
}
public double displayBalance()
{
	return balance;
}
	}