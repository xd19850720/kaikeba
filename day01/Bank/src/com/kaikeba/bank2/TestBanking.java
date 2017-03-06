package com.kaikeba.bank2;

public class TestBanking {

  public static void main(String[] args) {
     Customer customer;
     Account  account;
    // 1.创建一个客户，叫张三
     customer = new Customer("张三");
    // 2.给他一个账户，向该账户初始化500元钱
     account = new Account(500);
    // 3.取款150.00
     account.withdraw(150);
	// 4.存款 22.50
     account.deposit(22.50);
  	// 5.取款 45.5
     account.withdraw(45.5);
    // 6.查看该用户的最后余额
    System.out.println("Customer [" + customer.getName()
		   		       + "] has a balance of " + account.getBalance());
  }
}
