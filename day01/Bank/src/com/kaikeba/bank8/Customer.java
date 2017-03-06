package com.kaikeba.bank8;

public class Customer {

	private String name;
	private Account[] accounts = new Account[5];
	
	private int numOfAccounts;
	
	public Customer(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addAccount(Account account){
		accounts[numOfAccounts++] = account;
	}

	public Account getAccount(int index){
		return accounts[index];
	}
	public int getNumOfAccounts() {
		return numOfAccounts;
	}

	public void setNumOfAccounts(int numOfAccounts) {
		this.numOfAccounts = numOfAccounts;
	}
	
	
}
