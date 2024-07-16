package oopsBasic;

public class BankEncp {
	//Hiding class data
	private double balance;
	
	public void setBalance(double balance) {
		//add validation logic, to check data is correct or not
		this.balance = this.balance+balance;
	}
	public double getBalance() {
		//add validation logic, if needed
		return balance;
	}
}
