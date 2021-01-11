
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        
        // Ask the user their age
        System.out.println("How old are you?");
        
        // Store the age as an integer
        int age = Integer.valueOf(scan.nextLine());
        
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
