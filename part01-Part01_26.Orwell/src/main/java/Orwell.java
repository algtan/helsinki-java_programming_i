
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        // Prompt the usre for a number
        System.out.println("Give a number:");
        
        // Store the number as an integer
        int number = Integer.valueOf(scan.nextLine());
        
        if (number == 1984) {
            System.out.println("Orwell");
        }
    }
}
