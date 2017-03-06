package com.kaikeba.bank8;

public class TestBanking {

  public static void main(String[] args) {
    Bank  bank = Bank.getBank();
    Customer customer;
    CustomerReport report = new CustomerReport();

    // 1.创建一些用户和他们的账户
    bank.addCustomer(new Customer("张三"));
    customer = bank.getCustomer(0);
    customer.addAccount(new CheckingAccount(200.00, 400.00));

    bank.addCustomer(new Customer("李四"));
    customer = bank.getCustomer(1);
    customer.addAccount(new CheckingAccount(200.00));

    bank.addCustomer(new Customer("王五"));
    customer = bank.getCustomer(2);
    customer.addAccount(new CheckingAccount(200.00));

    bank.addCustomer(new Customer("赵六"));
    customer = bank.getCustomer(3);
    // 李四王五共享账户
    customer.addAccount(bank.getCustomer(2).getAccount(0));

    // 生成报表
    report.generateReport();
  }
}
