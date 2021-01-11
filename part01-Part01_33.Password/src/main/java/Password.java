
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        
        // Prompt user for password
        System.out.println("Password?");
        // Store password as a string
        String pw = scan.nextLine();
        
        if (pw.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
