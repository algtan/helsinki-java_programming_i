
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        // Prompt the user for the first number
        System.out.println("Give the first number:");
        
        // Store the first number in an int
        int first = Integer.valueOf(scanner.nextLine());
        
        // Prompt the user for the second number
        System.out.println("Give the second number:");
        
        // Store the second number in an int
        int second = Integer.valueOf(scanner.nextLine());
        
        // Prompt the user for the third number
        System.out.println("Give the third number:");
        
        // Store the third number in an int
        int third = Integer.valueOf(scanner.nextLine());
        
        // Sum the numbers
        int sum = first + second + third;
        
        // Print the sum
        System.out.println("The sum of the numbers is " + sum);
    }
}
