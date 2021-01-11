
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        
        // Prompt for first string
        System.out.println("Enter the first string:");
        // Store the first string
        String first = scan.nextLine();
        
        // Prompt for the second string
        System.out.println("Enter the second string:");
        // Store the second string
        String second = scan.nextLine();
        
        // Compare strings
        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
