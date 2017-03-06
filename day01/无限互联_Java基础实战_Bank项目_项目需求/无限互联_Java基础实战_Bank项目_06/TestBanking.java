package com.kaikeba.bank6;

import java.text.NumberFormat;



public class TestBanking {

  public static void main(String[] args) {
    NumberFormat currency_format = NumberFormat.getCurrencyInstance();
    Bank bank = new Bank();
    Customer customer;
    // 1.创建一些用户和账户
    bank.addCustomer(new Customer("张三"));
    customer = bank.getCustomer(0);
    customer.addAccount(new SavingAccount(500.00, 0.05));
    customer.addAccount(new CheckingAccount(200.00, 400.00));

    bank.addCustomer(new Customer("李四"));
    customer = bank.getCustomer(1);
    customer.addAccount(new CheckingAccount(200.00));

    bank.addCustomer(new Customer("王五"));
    customer = bank.getCustomer(2);
    customer.addAccount(new SavingAccount(1500.00, 0.05));
    customer.addAccount(new CheckingAccount(200.00));

    bank.addCustomer(new Customer("赵六"));
    customer = bank.getCustomer(3);
   
    customer.addAccount(new SavingAccount(150.00, 0.05));
    // 赵六和王五共享信用账户
    customer.addAccount(bank.getCustomer(2).getAccount(1));
    

    // 生成报表
    System.out.println("\t\t\tCUSTOMERS REPORT");
    System.out.println("\t\t\t================");

    //遍历银行的全部用户
    for ( int cust_idx = 0; cust_idx < bank.getNumberOfCustomers(); cust_idx++ ) {
        
		customer = bank.getCustomer(cust_idx);
        System.out.println("Customer: " + customer.getName());
        //遍历用户的全部账户
		for ( int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++ ) {
			Account account = customer.getAccount(acct_idx);
			String  account_type = "";

			// 确定账户的类型
			// Step 1: 用instanceof关键字判断账户类型，并给account_type赋值 "Savings Account"或者 "Checking Account"
			
			// 打印当前账户的账户类型和可用余额
		    
		}
    }
  }
}
