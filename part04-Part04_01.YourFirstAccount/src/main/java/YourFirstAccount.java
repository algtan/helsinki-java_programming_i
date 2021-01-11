
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        // Create new account with balance of 100.0
        Account artosAccount = new Account("Arto's account", 100.00);
        
        // Print initial state
        System.out.println("Initial state");
        System.out.println(artosAccount);
        
        // Deposit 20.0
        artosAccount.deposit(20);
        
        // Print final balance
        System.out.println("Latest state");
        System.out.println(artosAccount);
    }
}
