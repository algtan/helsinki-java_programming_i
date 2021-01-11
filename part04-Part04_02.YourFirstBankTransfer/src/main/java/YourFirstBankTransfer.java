
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        // Create an account named 'Matthews account' with a balance of 1000
        Account matthewsAccount = new Account("Matthews account", 1000);
        // Create an account named 'My account' with a balance of 0
        Account myAccount = new Account("My account", 0);
        
        // Withdraw 100 from Matthew's account
        matthewsAccount.withdrawal(100);
        // Deposit 100 to my account
        myAccount.deposit(100);
        
        // Print both accounts
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}
