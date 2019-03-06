package Constructor;

public class Main {

    public static void main(String[] args) {

        Account account = new Account("12345","diwankar","abc@gmail.com",1234567);
        account.checkAmount();
        account.deposit(500);
        account.deposit(1000);
        account.checkAmount();
        account.withdraw(5000);
        account.withdraw(400);
        account.checkAmount();



    }

}
