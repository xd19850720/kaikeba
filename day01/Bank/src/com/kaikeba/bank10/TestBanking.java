package com.kaikeba.bank10;

public class TestBanking {

  public static void main(String[] args) {
    Bank bank = Bank.getBank();
    Customer customer;
    Account  account;

    // 创建两个用户和账户
    bank.addCustomer(new Customer("张三"));
    customer = bank.getCustomers(0);
    customer.addAccount(new SavingAccount(500.00, 0.05));
    customer.addAccount(new CheckingAccount(200.00, 500.00));
    bank.addCustomer(new Customer("李四"));
    customer = bank.getCustomers(1);
    customer.addAccount(new CheckingAccount(200.00));

    // 测试张三的信用账户
    customer = bank.getCustomers(0);
    account = customer.getAccount(1);
    System.out.println("Customer [" + customer.getName()+ "]"
		       + " has a checking balance of "
		       + account.getBalance()
			 + " with a 500.00 overdraft protection.");
     //操作张三的账户并捕获异常
    try {
       //取款150.00元，存款22.50元，取款147.62元，取款470.00
    	
    } catch (OverdraftException e1) {
      System.out.println("Exception: " + e1.getMessage()
			 + "   Deficit: " + e1.getDeficit());
    } finally {
      System.out.println("Customer [" + customer.getName()+ "]"
			 + " has a checking balance of "
			 + account.getBalance());
    }

    // 测试李四的信用账户
    customer = bank.getCustomers(1);
    account = customer.getAccount(0);
    System.out.println("Customer [" + customer.getName() + "]"
		       + " has a checking balance of "
		       + account.getBalance());
    //操作张三的账户并捕获异常
    try {
    	//取款100元，存款25.00元，取款175元
    	
    } catch (OverdraftException e1) {
      System.out.println("Exception: " + e1.getMessage()
			 + "   Deficit: " + e1.getDeficit());
    } finally {
      System.out.println("Customer [" + customer.getName() + "]"
			 + " has a checking balance of "
			 + account.getBalance());
    }
  }
}
