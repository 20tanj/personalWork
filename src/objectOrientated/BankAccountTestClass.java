package objectOrientated;

public class BankAccountTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount savings=new BankAccount(2000, 232.0, 3.0);
BankAccount checkings=new BankAccount(2000, 232.0, 3.0);
savings.deposit(100.0);
checkings.setInterest(18.0);
checkings.withdraw(1000);
savings.addInterest(10.0);
checkings.financeCharge(50.0);
System.out.println(savings.displayBalance());
System.out.println(checkings.displayBalance());
	}

}
