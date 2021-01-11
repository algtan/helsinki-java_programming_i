
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        // Ask the user how many days they would like to convert to seconds
        System.out.println("How many days would you like to convert to seconds?");
        
        // Store the user's days in an int
        int days = Integer.valueOf(scanner.nextLine());
        
        int seconds = days * 86400;
        
        // Print the number of seconds in that amount of days
        System.out.println(seconds);
    }
}
