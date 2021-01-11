
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int longest = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            
            int length = pieces[0].length();
            int year = Integer.valueOf(pieces[1]);
            
            //System.out.println(length);
            
            if (length > longest) {
                name = pieces[0];
                longest = length;
            }
            
            sum = sum + year;
            count = count + 1;
        }
        
        double avg = sum / (double) count;
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + avg);
    }
}
