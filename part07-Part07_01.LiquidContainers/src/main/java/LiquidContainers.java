
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;


        while (true) {
//            System.out.print("> ");
            // Output to the user the amount held by both containers
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            // Store user input into a String
            String input = scan.nextLine();
            System.out.println("");
            
            // Split the String to break down command and amount
            String[] parts = input.split(" ");

            // Store information from the split String
            String command = parts[0];
            
            // Initialize int amount
            int amount = 0;
            // If the input has multiple arguments (i.e. contains 
            if (parts.length > 1) {
                amount = Integer.valueOf(parts[1]);
            }
            
            // Initialize temp values to determine if amount is appropriate
            int tempFirst = 0;
            int tempSecond = 0;
            
            if (input.equals("quit")) {
                break;
                
            } else if (command.equals("add") && amount >= 0) {
                tempFirst = first + amount;
                
                if (tempFirst > 100) {
                    first = 100;
                } else {
                    first = first + amount;
                }
                
            } else if (command.equals("move") && amount >= 0) {
                // Conditions for first container if amount is greater than what the first container currently holds
                if (amount > first) {
                    amount = first;
                }
                
                // Move amount to second container
                tempSecond = second + amount;
                if (tempSecond > 100) {
                    second = 100;
                } else {
                    second = second + amount;
                }
                
                // Subtract amount from first container
                first = first - amount;
                
            } else if (command.equals("remove") && amount >= 0) {
                tempSecond = second - amount;
                if (tempSecond < 0) {
                    second = 0;
                } else {
                    second = second - amount;
                }
            }
        }
    }

}
