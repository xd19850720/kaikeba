package com.kaikeba.bank10;

import java.util.ArrayList;
import java.util.List;


public class Bank {

	private static Bank instance = new Bank();
	private List<Customer> customers = new ArrayList<>();
	
	
	private Bank(){

	}
	
	public static Bank getBank(){
		return instance;
	}
	public void addCustomer(Customer customer){
		customers.add(customer);
	}

	public Customer getCustomers(int index) {
		return customers.get(index);
	}

	public int getNumofCustomer(){
		return customers.size();
	}
}
