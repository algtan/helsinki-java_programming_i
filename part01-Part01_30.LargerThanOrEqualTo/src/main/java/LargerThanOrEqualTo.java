
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.println("Give the first number:");
        
        // Store the first number as an integer
        int first = Integer.valueOf(scan.nextLine());
        
        // Prompt the user for the second number
        System.out.println("Give the second number:");
        
        // Store the second number as an integer
        int second = Integer.valueOf(scan.nextLine());
        
        // Conditions
        if (first > second) {
            System.out.println("Greater number is: " + first);
        } else if (second > first) {
            System.out.println("Greater number is: " + second);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
