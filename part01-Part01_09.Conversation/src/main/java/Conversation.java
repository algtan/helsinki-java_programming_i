
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        // Greet the user
        System.out.println("Greetings! How are you doing?");
        
        // User will input their first response
        String first = scanner.nextLine();
        
        // Reply with "...interesting. Tell me more!"
        System.out.println("Oh, how interesting. Tell me more!");
        
        // User will input their second response
        String second = scanner.nextLine();
        
        // End conversation
        System.out.println("Thanks for sharing!");
    }
}
