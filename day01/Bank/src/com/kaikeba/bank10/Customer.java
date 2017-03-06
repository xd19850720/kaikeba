package com.kaikeba.bank10;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private List<Account> accounts = new ArrayList<>();
	
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
		accounts.add(account);
	}

	public Account getAccount(int index){
		return accounts.get(index);
	}
	public int getNumOfAccounts() {
		return accounts.size();
	}

	public void setNumOfAccounts(int numOfAccounts) {
		this.numOfAccounts = numOfAccounts;
	}
	
	
}
