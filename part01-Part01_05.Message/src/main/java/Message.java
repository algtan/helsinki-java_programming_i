
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here

        // Store the user's message to a string called 'message'
        String message = scanner.nextLine();
        
        // Print out the user's message
        System.out.println(message);
    }
}
