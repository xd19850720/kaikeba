
import banking.*;

public class TestBanking {

  public static void main(String[] args) {
    Bank  bank = new Bank();

    // 1.添加客户乔峰
	
    // 2.添加客户段誉
	
    // 3.添加客户虚竹

    // 4.添加客户鸠摩智

    for ( int i = 0; i < bank.getNumOfCustomers(); i++ ) {
      Customer customer = bank.getCustomer(i);

      System.out.println("Customer [" + (i+1) + "] is "
			
			 + ", " + customer.getName());
    }
  }
}
