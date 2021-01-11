
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        // Begin the story
        System.out.println("I will tell you a story, but I need some information first.");
        
        // Prompt the user for the character's name
        System.out.println("What is the main character called?");
        
        // Store user input for character's name
        String name = scanner.nextLine();
        
        // Prompt the user for the character's job
        System.out.println("What is their job?");
        
        // Store user input for character's job
        String job = scanner.nextLine();
        
        // Return the story
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + name + ", who was " + job + ".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be " + job + " forever.");
    }
}
