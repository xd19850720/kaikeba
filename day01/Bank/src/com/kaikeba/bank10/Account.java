package com.kaikeba.bank10;

public class Account {

	protected double balance;
	
	public Account(double init_balance){
		this.balance = init_balance;
	}

	public Double getBalance() {
		return balance;
	} 
	
	public void deposit(double amt){
		
		this.balance += amt;
		
	}
	
	public void withdraw(double amt){
		if( amt > this.balance){
			throw new OverdraftException("资金不足", amt - balance);
		}
		this.balance -= amt;
	}
	
	
}
