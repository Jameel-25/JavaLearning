package oopsBasic;

public class Cleark {
	public static void main(String[] args) throws InsufficientFundsException, InvalidAmountException {
		Bank b1 = new Bank(1, 5000, "Jameel", "Mohammed");
		Bank b2 = new Bank(2, 5000, "Rama", "Krishna");
		b1.deposite(-1);
		b1.withdraw(8);
		System.err.println("b1");
	}
}
