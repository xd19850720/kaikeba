package com.kaikeba.bank3;

public class TestBanking {

  public static void main(String[] args) {
    Customer customer;
    Account  account;

    // 1.创建客户叫张三
    customer = new Customer("张三");
	// 2.创建他的账户，初始化500元 
    account = new Account(500);
	// 3.对该账户做一些操作：取款150元，存款25元，存款60元，取款400元
    account.withdraw(150);
    account.deposit(25);
    account.deposit(10);
    account.withdraw(400);
	    
    // 4.查看该客户的余额
    System.out.println("Customer [" + customer.getName()
		    		       + "] has a balance of " + account.getBalance());
  }
}
