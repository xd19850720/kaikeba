package com.kaikeba.bank9;


public class Bank {

	private static Bank instance = new Bank();
	private Customer[] customers;
	
	private int numberOfCustomers;
	
	private Bank(){
		customers= new Customer[5];
	}
	
	public static Bank getBank(){
		return instance;
	}
	public void addCustomer(Customer customer){
		customers[numberOfCustomers++] = customer;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int index){
		return customers[index];
	}
	
}
