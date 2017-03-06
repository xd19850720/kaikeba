package com.kaikeba.bank6;

public class CheckingAccount extends Account{

	private double overdraftProtection;
	
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
	public boolean withdraw(double amt) {
		if(this.balance>amt){
			this.balance = this.balance - amt;
		}else if(amt - (this.balance+overdraftProtection) < 0 ){
			this.overdraftProtection = overdraftProtection - (amt - this.balance);
			this.balance = 0;
		}else {
			return false;
		}
		return true;
	}
}
