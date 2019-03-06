package Autoboxing;

import java.util.ArrayList;

public class Customer {

  private String name;
  private ArrayList<Double> transactionsArrayList;

  public ArrayList<Double> getTransactionsArrayList() {
    return transactionsArrayList;
  }

  public Customer(String name, Double transactions) {
    this.name = name;
    this.transactionsArrayList = new ArrayList<>();
    transactionsArrayList.add(transactions);
  }

  public String getName() {
    return name;
  }

  public void addAmount(double transactions) {

    this.transactionsArrayList.add(transactions);

  }

  @Override
  public String toString() {
    return "Customer{" +
        "name='" + name + '\'' +
        ", transactionsArrayList=" + transactionsArrayList +
        '}';
  }
}
