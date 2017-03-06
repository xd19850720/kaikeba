package com.kaikeba.bank6;

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
	
	public boolean withdraw(double amt){
		if( amt > this.balance){
			return false;
		}
		this.balance -= amt;
		return true;
	}
	
	
}
