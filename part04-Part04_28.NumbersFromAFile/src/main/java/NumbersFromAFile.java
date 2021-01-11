
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        // Create an ArrayList to capture the information in the file
        ArrayList<Integer> list = new ArrayList<>();
        
        // Create a scanner that takes the input of the file and puts it into an ArrayList
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (fileScanner.hasNextLine()) {
                list.add(Integer.valueOf(fileScanner.nextLine()));
            }
        } catch (Exception e) {
            //System.out.println("Error: " + e.getMessage());
            System.out.println("Reading the file " + file + " failed.");
        }
        
        int count = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= lowerBound && list.get(i) <= upperBound) {
                count = count + 1;
            }
        }
        
        System.out.println("Numbers: " + count);

    }

}
