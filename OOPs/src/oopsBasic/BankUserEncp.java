package oopsBasic;

public class BankUserEncp {
	public static void main(String[] args) {
		BankEncp hdfcBank = new BankEncp();
		hdfcBank.setBalance(500);
		System.out.println(hdfcBank.getBalance());
	}
}
