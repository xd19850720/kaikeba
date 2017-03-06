package com.kaikeba.bank6;

public class Bank {

	private Customer[] customers;
	
	private int numberOfCustomers;
	
	public Bank(){
		customers= new Customer[5];
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
