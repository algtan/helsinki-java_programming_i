
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the name of the file
        System.out.println("Name of the file:");
        // Store the filename as a string
        String filename = scanner.nextLine();
        
        // Create an ArrayList to capture the information in the file
        ArrayList<String> list = new ArrayList<>();
        
        // Create a scanner that takes the input of the file and puts it into an ArrayList
        try (Scanner fileScanner = new Scanner(Paths.get(filename))) {

            // we read all the lines of the file
            while (fileScanner.hasNextLine()) {
                list.add(fileScanner.nextLine());
            }
        } catch (Exception e) {
            //System.out.println("Error: " + e.getMessage());
            System.out.println("Reading the file " + filename + " failed.");
        }
        
        for (int i = 0; i < list.size(); i++) {
            String line = list.get(i);
            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            
            if (age == 1) {
                System.out.println(name + ", age: " + age + " year");
            } else {
                System.out.println(name + ", age: " + age + " years");
            }
            
        }

    }
}
