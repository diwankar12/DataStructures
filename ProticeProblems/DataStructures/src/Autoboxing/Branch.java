package Autoboxing;

import java.util.ArrayList;

public class Branch {

  private String branchName;
  private ArrayList<Customer> customerArrayList;


  public Branch(String branchName) {
    this.branchName = branchName ;
    this.customerArrayList = new ArrayList<>();

  }


  public String getBranchName() {
    return branchName;
  }

  public ArrayList<Customer> getCustomerArrayList() {
    return customerArrayList;
  }


  private boolean checkCustomer(String customerName) {
    for (int i = 0; i < customerArrayList.size(); i++) {

      if (customerArrayList.get(i).getName().equals(customerName)) {
        System.out.println("Found customer on the branch");
        return true;
      }
    }
    return false;
  }


  public boolean addNewCustomer(String customerName, double transaction) {
    if (!checkCustomer(customerName)) {
      customerArrayList.add(new Customer(customerName, transaction));
      System.out.println("Added customer and transaction");
      return true;
    }
    return false;
  }

  public boolean addCustomerTransaction(String CustomerName, double amount) {

    Customer existingCustomer = findCustomer(CustomerName);
    if (existingCustomer != null) {

      System.out.println("Existing Customer :" + existingCustomer.getName());
      existingCustomer.addAmount(amount);
      return true ;
    }
    return false ;

  }

  private Customer findCustomer(String customerName) {

    for (int i = 0; i < customerArrayList.size(); i++) {
      if (customerArrayList.get(i).getName().equals(customerName)) {

        System.out.println("Customer is on the file " + customerName);
        return customerArrayList.get(i);
      }

    }
    return null;
  }


  @Override
  public String toString() {
    return "Branch{" +
        "branchName='" + branchName + '\'' +
        ", customerArrayList=" + customerArrayList +
        '}';
  }
}
