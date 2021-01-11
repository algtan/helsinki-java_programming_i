/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allen
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
                
            } else if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                
                // Add to dictionary
                this.dict.add(word, translation);
                
            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String search = scanner.nextLine();
                
                String output = dict.translate(search);
                
                if (output == null) {
                    System.out.println("Word " + search + " was not found");
                } else {
                    System.out.println("Translation: " + output);
                }
                
            } else {
                System.out.println("Unknown command");
            }
            
        }
        
        System.out.println("Bye bye!");
    }
}
