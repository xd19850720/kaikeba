package com.kaikeba.bank10;

public class CheckingAccount extends Account{

	private double overdraftProtection;
	
	private double overdraftbalance;
	
	public boolean addOverdraftbalance(double amount){
		this.overdraftbalance += amount;
		return true;
	}
	public double getOverdraftbalance() {
		return overdraftbalance;
	}

	public void setOverdraftbalance(double overdraftbalance) {
		this.overdraftbalance = overdraftbalance;
	}

	public CheckingAccount(double balance) {
		super(balance);
	}

	public CheckingAccount(double balance,double protect) {
		super(balance);
		overdraftProtection = protect;
	}
	
	public double getOverdraftProtection() {
		return overdraftProtection;
	}

	public void setOverdraftProtection(double overdraftProtection) {
		this.overdraftProtection = overdraftProtection;
	}

	@Override
	public void withdraw(double amt) {
		if(this.balance > amt){
			this.balance = this.balance - amt;
		}else if(amt - (this.balance + (overdraftProtection + overdraftbalance)) < 0 ){
			this.overdraftbalance = overdraftbalance - (amt - this.balance);
			this.balance = 0;
		}else {
			
			throw new OverdraftException("Insufficient funds for overdraft protection", amt - balance);
		}
	}
}
