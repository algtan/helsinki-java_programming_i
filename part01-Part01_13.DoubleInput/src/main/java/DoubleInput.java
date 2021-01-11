
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        
        // Prompt the user for a floating-point number
        System.out.println("Give a number:");
        
        // Store the user's input
        double value = Double.valueOf(scanner.nextLine());
        
        // Print out the user's input
        System.out.println("You gave the number " + value);

    }
}
