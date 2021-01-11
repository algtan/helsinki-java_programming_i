
import java.util.Scanner;

public class AverageOfThreeNumbers {

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
        
        // Prompt the user for the third number
        System.out.println("Give the third number:");
        
        // Store the third number
        int third = Integer.valueOf(scanner.nextLine());
        
        // Calculate the result
        double result = ( (double) first + second + third ) / 3;
        
        // Print the result
        System.out.println("The average is " + result);

    }
}
