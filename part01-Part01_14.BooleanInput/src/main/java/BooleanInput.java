
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here

        // Prompt the user for an input
        System.out.println("Write something:");
        
        // Store the boolean value of the user's response
        boolean value = Boolean.valueOf(scanner.nextLine());
        
        // Print out the boolean value
        System.out.println("True or false? " + value);
    }
}
