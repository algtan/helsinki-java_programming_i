
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        
        // Create an ArrayList of birds
        ArrayList<Bird> birds = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scanner.nextLine();
                
                Bird bird = new Bird(name, nameLatin);
                birds.add(bird);
            } else if (command.equals("Observation")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                
                boolean exists = false;
                
                for (Bird bird: birds) {
                    if (bird.getName().equals(name)) {
                        exists = true;
                        bird.observed();
                    }
                }
                
                if (exists == false) {
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("All")) {
                for (Bird bird: birds) {
                    System.out.println(bird);
                }
            } else if (command.equals("One")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                
                boolean exists = false;
                
                for (Bird bird: birds) {
                    if (bird.getName().equals(name)) {
                        exists = true;
                        System.out.println(bird);
                    }
                }
                
                if (exists == false) {
                    System.out.println("Not a bird!");
                }
            }
        }

    }

}
