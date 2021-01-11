
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
//            System.out.print("> ");
            // Output to the user the amount held by both containers
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

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
                       
            if (input.equals("quit")) {
                break;
                
            } else if (command.equals("add")) {
                first.add(amount);
                
            } else if (command.equals("move")) {
                if (first.contains() > 0) {
                    if (amount > first.contains()) {
                        amount = first.contains();
                    }
                    
                    // Move amount to second container
                    second.add(amount);

                    // Subtract amount from first container
                    first.remove(amount);
                }
                
            } else if (command.equals("remove")) {
                second.remove(amount);
            }
        }

    }

}
