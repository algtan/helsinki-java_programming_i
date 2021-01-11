
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here

        // Prompt the user for the first number
        System.out.println("Give the first number:");
        
        // Store the first number
        int first = Integer.valueOf(scanner.nextLine());
        
        // Prompt the user for the second number
        System.out.println("Give the second number:");
        
        // Store the second number
        int second = Integer.valueOf(scanner.nextLine());
        
        // Calculate the sum
        int sum = first + second;
        
        // Print the equation
        System.out.println(first + " + " + second + " = " + sum);
    }
}
