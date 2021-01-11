
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here

        // Get the user's input
        String message = scanner.nextLine();
        
        // Print out the user's input 3 times
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}
