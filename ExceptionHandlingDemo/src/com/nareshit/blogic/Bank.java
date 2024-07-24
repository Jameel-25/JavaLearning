package com.nareshit.blogic;

import com.nareshit.exceptions.InSufficientFundsException;
import com.nareshit.exceptions.InvalidAmountException;

public interface Bank {
	public void deposit(double amt) throws InvalidAmountException;

	public double withdraw(double amt) throws InSufficientFundsException;

	public void balanceEnquiry();
}
