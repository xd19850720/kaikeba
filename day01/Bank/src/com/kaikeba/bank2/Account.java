package com.kaikeba.bank2;

public class Account {

	private double balance;
	
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
		this.balance -= amt;
	}
	
	
}
