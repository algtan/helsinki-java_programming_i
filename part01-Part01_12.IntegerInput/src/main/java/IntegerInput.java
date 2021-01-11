
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        
        // Prompt the user for an integer
        System.out.println("Give a number:");
        
        // Store the number the user inputs
        int value = Integer.valueOf(scanner.nextLine());
        
        // Print out the user's number
        System.out.println("You gave the number " + value);

    }
}
