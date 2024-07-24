package com.nareshit.blogic;

import com.nareshit.exceptions.InSufficientFundsException;
import com.nareshit.exceptions.InvalidAmountException;

public class HDFCBank implements Bank {
	private double balance;

	public void deposit(double amt) throws InvalidAmountException {
		if (amt <= 0) {
			throw new InvalidAmountException(amt + " is invalid amount");
		}
		balance += amt;
	}

	public double withdraw(double amt) throws InSufficientFundsException {
		if (balance < amt) {
			throw new InSufficientFundsException("InSufficient Funds");
		}
		balance -= amt;
		return amt;
	}

	public void balanceEnquiry() {
		System.out.println("Current Balance:" + balance);
	}
}
