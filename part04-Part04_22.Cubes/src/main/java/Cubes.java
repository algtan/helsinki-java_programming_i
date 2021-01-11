
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        int cubed = 0;

        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            num = Integer.valueOf(input);
            
            cubed = num * num * num;
            System.out.println(cubed);
        }
        
    }
}
