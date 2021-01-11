
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        
        while (!input.equals("")) {
            String[] pieces = input.split(" ");
            
            int last = pieces.length - 1;
            
            System.out.println(pieces[last]);
            
            input = scanner.nextLine();
        }
    }
}
