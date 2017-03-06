package com.kaikeba.bank5;

public class TestBanking {

  public static void main(String[] args) {
    Bank  bank;
    Customer customer;
    Account account;

   
    // 1.创建银行
    bank = new Bank();
	// 2.该银行给张三开户，并创建他的储蓄账户，初始余额500元，利率3%
    customer = new Customer("张三");
    bank.addCustomer(customer);
    account = new SavingAccount(500,0.03);
    customer.setAccount(account);
	// 3.该银行给李四开户，并创建他的信用账户，初始余额500元，但没有信用额度
    customer = new Customer("李四");
    bank.addCustomer(customer);  
    account = new SavingAccount(500);
    customer.setAccount(account);
	// 4.该银行给王五开户，并创建他的信用账户，初始余额500元，信用额度500元
    customer = new Customer("王五");
    bank.addCustomer(customer);  
    account = new CheckingAccount(500,500);
    customer.setAccount(account);
    // 5.给王红开户，王红和他老公王五共享一个账户
    customer = new Customer("王红");
    bank.addCustomer(customer);  
    customer.setAccount(bank.getCustomer(2).getAccount());
	// 6.对张三账户进行操作 ：取款150元，存款22元，取款50元，存款400元，最后查看账户余额
    account = bank.getCustomer(0).getAccount();
    account.withdraw(150);
    account.deposit(22);
    account.withdraw(50);
    account.deposit(400);
    System.out.println(account.getBalance());
    // 7.对李四的账户进行操作：取款150元，存款22元，取款50元，取款400元(查看取款是否成功)，最后查看账户余额
    account = bank.getCustomer(1).getAccount();
    account.withdraw(150);
    account.deposit(22);
    account.withdraw(50);
    System.out.println(account.withdraw(400));//false
    System.out.println(account.getBalance());
    // 8.对王五的账户进行操作：取款150元，存款22元，取款50元，取款400元(查看取款是否成功)，最后查看账户余额,查看信用账户余额
    account = bank.getCustomer(2).getAccount();
    account.withdraw(150);
    account.deposit(22);
    account.withdraw(50);
    System.out.println(account.withdraw(400));//true
    System.out.println(account.getBalance()+"  " + ((CheckingAccount)account).getOverdraftProtection());
	// 9.对王红的账户进行操作：存款150元，取款750元(如果取款550呢？)，最后查看余额
    account = bank.getCustomer(3).getAccount();
    account.deposit(150);
    account.withdraw(750);
    System.out.println(account.getBalance()+"  " + ((CheckingAccount)account).getOverdraftProtection());
  }
}
