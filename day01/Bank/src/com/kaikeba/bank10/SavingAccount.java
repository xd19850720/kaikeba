package com.kaikeba.bank10;

public class SavingAccount extends Account{

	private double interestRate;
	
	
	public SavingAccount(double init_balance) {
		super(init_balance);
	}
	
	public SavingAccount(double balance,double init_balance) {
		 super(balance);
		 this.interestRate = init_balance;
	}
	
	
	

}
