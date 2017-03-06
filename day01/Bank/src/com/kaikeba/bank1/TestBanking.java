package com.kaikeba.bank1;

public class TestBanking {

  public static void main(String[] args) {
    Account  account;

    //1.创建一个账户，并存入500元
    account = new Account(500);  
	//2.取款150元
    account.withdraw(150);
	//3.存入22.50
    account.deposit(22.50);
	//4.取款45.5
    account.withdraw(45.5);
    //5.查看余额
    System.out.println("The account has a balance of " + account.getBalance());
  }
}
