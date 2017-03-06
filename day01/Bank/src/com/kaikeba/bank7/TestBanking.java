package com.kaikeba.bank7;

public class TestBanking {

  public static void main(String[] args) {
    Bank bank = new Bank();
    Customer customer;
    Account account;

    // 创建两个用户以及他们的用户
    bank.addCustomer(new Customer("张三"));
    customer = bank.getCustomer(0);
    //存款200，设置信用额度500
    account = new CheckingAccount(200.00, 500);
    customer.addAccount(account);
    
	bank.addCustomer(new Customer("李四"));
    customer = bank.getCustomer(1);
    account = new CheckingAccount(200.00, 500);
    customer.addAccount(account);

    // 测试张三的信用账户
    customer = bank.getCustomer(0);
    account = customer.getAccount(0);
    System.out.println("Customer [" + customer.getName()+"]");
    //查看用户账户余额和信用账户余额
    System.out.println(account.getBalance() +  " :" + ((CheckingAccount)account).getOverdraftbalance());
    //取款150
    System.out.println(account.withdraw(150));
    //存款22.50
    account.deposit(22.50);
    //取款147.62
    account.withdraw(147.62);
    //查看用户账户余额、信用账户余额、信用额度
    System.out.println(account.getBalance() + ":"+((CheckingAccount)account).getOverdraftbalance()+ " :" + ((CheckingAccount)account).getOverdraftProtection());


    // 测试李四的信用账号
    customer = bank.getCustomer(1);
    account = customer.getAccount(0);
    System.out.println("Customer [" + customer.getName()+"]");
    //查看用户账户余额和信用账户余额
    System.out.println(account.getBalance() +  " :" + ((CheckingAccount)account).getOverdraftbalance());
    //取款250
    System.out.println(account.withdraw(250));
    //存款22.50
    account.deposit(22.50);
    //取款647.62
    account.withdraw(647.62);
    //查看用户账户余额、信用账户余额、信用额度
    System.out.println(account.getBalance() + ":"+((CheckingAccount)account).getOverdraftbalance()+ " :" + ((CheckingAccount)account).getOverdraftProtection());

  }
}
