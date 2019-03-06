package Constructor;

public class Account {


    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.


    private String accountNumber ;
    private double balance ;
    private String CustomerName ;
    private String email ;
    private int phoneNumber ;

    public Account(String accountNumber, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.CustomerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount){

        if(amount > 0) {

            balance += amount;
            System.out.println("Now the balance in the account is after deposit of " + amount + "=>" +getBalance());
        } else {

            System.out.println("Entered wrong amount");
        }


    }

    public boolean withdraw(int withdrawAmount){

       double balanceLeft = balance - withdrawAmount ;

        if (balanceLeft > 0){

            System.out.println("Withdrawal success : Total amount is now :" + balanceLeft);
            setBalance(balanceLeft);
            return true ;

        } else {

            System.out.println("Insufficent balance , please deposit some amount");
            return false ;
        }

    }

    public void checkAmount(){

        System.out.println("Total balance in the account for " + getCustomerName() + " => " + getBalance());
    }



}
