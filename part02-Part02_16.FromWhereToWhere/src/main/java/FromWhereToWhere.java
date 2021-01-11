
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.printf("Where to? ");
        int dest = Integer.valueOf(scanner.nextLine());
        
        System.out.printf("Where from? ");
        int start = Integer.valueOf(scanner.nextLine());
        
        for (int i = start; i <= dest; i++) {
            System.out.println(i);
        }
    }
}
