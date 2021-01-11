
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        // Prompt the user for an integer
        System.out.println("Give a number");
        
        // Store the number as an integer
        int number = Integer.valueOf(scan.nextLine());
        
        // Check if number is positive
        if (number >= 1) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is not positive");
        }
    }
}
