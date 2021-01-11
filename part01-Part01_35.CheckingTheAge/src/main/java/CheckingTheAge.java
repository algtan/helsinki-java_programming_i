
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user for their age
        System.out.println("How old are you?");
        // Store their age as an integer
        int age = Integer.valueOf(scan.nextLine());
        
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
