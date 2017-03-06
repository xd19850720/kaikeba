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
   
    System.out.println("Customer [" + customer.getName()+"]");
    //查看用户账户余额和信用账户余额
    
    //取款150
   
    //存款22.50
   
    //取款147.62
  
    //查看用户账户余额、信用账户余额、信用额度
   

    // 测试李四的信用账号
    
    System.out.println("Customer [" + customer.getName()+"]");
    //查看用户账户余额和信用账户余额
   
   //取款250
   
    //存款22.50
    
    //取款647.62
    
    //查看用户账户余额、信用账户余额、信用额度
  
  }
}
