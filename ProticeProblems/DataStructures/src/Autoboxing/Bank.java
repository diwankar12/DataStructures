package Autoboxing;

import java.util.ArrayList;

public class Bank {

  private String name;
  private ArrayList<Branch> branchArrayList;


  public Bank(String name) {
    this.name = name;
    this.branchArrayList = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public ArrayList<Branch> getBranchArrayList() {
    return branchArrayList;
  }


  public boolean addBranch(String branchname) {

    if (find(branchname) == null) {
      this.branchArrayList.add(new Branch(branchname));
      return true ;

    }

    return false;

  }

  private Branch find(String branchName) {
    for(int i=0; i<this.branchArrayList.size(); i++) {
      Branch checkedBranch = this.branchArrayList.get(i);
      if(checkedBranch.getBranchName().equals(branchName)) {
        return checkedBranch;
      }
    }

    return null;
  }




  public boolean addCustomerBank(String branchName, String customerName, double transaction) {
    Branch branch = find(branchName);
    if (branch != null) {
      System.out.println("Added the row");
      return branch.addNewCustomer(customerName, transaction);
    }

    return false;
  }

  public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
    Branch branch = find(branchName);
    if (branch != null) {

      branch.addCustomerTransaction(customerName, transaction);
      System.out.println("Transaction done");
      return true ;

    }
return false ;

  }

  public boolean listCustomers(String branchName, boolean showTransactions) {

    Branch branch = find(branchName);
    if (branch != null) {
      System.out.println(branchName + "Branch is not on the file ");

      ArrayList<Customer> customerarray = branch.getCustomerArrayList();
      for (int i = 0; i < customerarray.size(); i++) {
        Customer branchCustomer = customerarray.get(i);
        System.out.println("Customers " + customerarray.get(i).getName() + "[" + (i + 1) + "]");
        if (showTransactions) {
          System.out.println("Transactions");
          ArrayList<Double> transactionList = branchCustomer.getTransactionsArrayList();
          for (int j = 0; j < transactionList.size(); j++) {

            System.out.println("[" + (j + 1) + "]  Amount " + transactionList.get(j));


          }


        }
      }
      return true;


    } else {


      return false ;
    }

  }

}








