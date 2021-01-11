
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        // Prompt the user for a string
        System.out.println("Give a string:");
        
        // Store the user's string
        String string = scan.nextLine();
        
        // Prompt the user for an integer
        System.out.println("Give an integer:");
        
        // Store the user's integer
        int integer = Integer.valueOf(scan.nextLine());
        
        // Prompt the user for a floating-point value
        System.out.println("Give a double:");
        
        // Store the user's floating-point value
        double value = Double.valueOf(scan.nextLine());
        
        // Prompt the user for a boolean
        System.out.println("Give a boolean:");
        
        // Store the user's boolean
        boolean bool = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + value);
        System.out.println("You gave the boolean " + bool);
    }
}
