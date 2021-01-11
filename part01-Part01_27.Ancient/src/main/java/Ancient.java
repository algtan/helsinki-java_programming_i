
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        // Prompt the user for a year
        System.out.println("Give a year:");
        
        // Store the year as an integer
        int year = Integer.valueOf(scan.nextLine());
        
        // Check if year is smaller than 2015
        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
