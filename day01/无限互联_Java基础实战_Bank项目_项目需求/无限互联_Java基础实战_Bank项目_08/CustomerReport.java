package com.kaikeba.bank8;

public class CustomerReport {

	public void generateReport() {
		//获取银行类
		Bank bank;
		
		Customer customer = null;
		
		System.out.println("\t\t\tCUSTOMERS REPORT");
		System.out.println("\t\t\t================");
		String account_type = "";
		for (int cust_idx = 0; cust_idx < bank.getNumberOfCustomers(); cust_idx++) {
			customer = bank.getCustomer(cust_idx);

			System.out.println();
			System.out.println("Customer: " + customer.getName() );

			for (int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++) {
				Account account = customer.getAccount(acct_idx);
				
				

				if (account instanceof SavingAccount) {
					account_type = "Savings Account";
				} else if (account instanceof CheckingAccount) {
					account_type = "Checking Account";
				}
				System.out.println(account_type + ": current balance is"
						+ account.getBalance());
			}
		}

	}

}
