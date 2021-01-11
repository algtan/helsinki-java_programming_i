
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        // Prompt the user for the first number
        System.out.println("Give the first number:");
        // Store the first number
        int first = Integer.valueOf(scanner.nextLine());
        
        // Prompt the user for the second number
        System.out.println("Give the second number:");
        // Store the second number
        int second = Integer.valueOf(scanner.nextLine());
        
        // Run calculations
        int sum = first + second;
        int diff = first - second;
        int prod = first * second;
        double quotient = (double) first / second;
        
        // Print results
        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + diff);
        System.out.println(first + " * " + second + " = " + prod);
        System.out.println(first + " / " + second + " = " + quotient);
    }
}
