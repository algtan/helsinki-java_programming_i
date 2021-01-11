
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        // Prompt the user for their name
        System.out.println("What's your name?");
        
        // Store the user's name to a string 'name'
        String name = scanner.nextLine();
        
        // Greet the user using their inputted name
        System.out.println("Hi " + name);
    }
}
