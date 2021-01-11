
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        // Prompt the user for the first number
        System.out.println("Give the first number:");
        
        // Store the first number as a double
        int first = Integer.valueOf(scanner.nextLine());
        
        // Prompt the user for the second number
        System.out.println("Give the second number:");
        
        // Store the second number as a double
        int second = Integer.valueOf(scanner.nextLine());
        
        // Calculate the avg
        double avg = ((double) first + second) / 2;
        
        // Print the average
        System.out.println("The average is " + avg);
    }
}
