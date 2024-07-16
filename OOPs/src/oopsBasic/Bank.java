package oopsBasic;

public class Bank {
	// BankAccount properties (values required to perform operations
	private long accNo;
	private double balance;
	private String userName;
	private String password;

	// Parameterized constructor to initialize instance
	public Bank(long accNo, double balance, String userName, String password) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.userName = userName;
		this.password = password;
	}

	// Bank Behaviors (an operation to complete a transaction)
	public void deposite(double amt) throws InvalidAmountException {
		if (amt <= 0) {
			throw new InvalidAmountException();
		}
		balance += amt;
	}

	public double withdraw(double amt) throws InsufficientFundsException {
		if (balance < amt) {
			throw new InsufficientFundsException();
		}
		balance -= amt;
		return amt;
	}

}
