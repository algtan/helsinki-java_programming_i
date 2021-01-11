
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.valueOf(scanner.nextLine());
        
        int abs;
        
        if (num < 0) {
            abs = num * -1;
        } else {
            abs = num;
        }
        
        System.out.println(abs);
        
    }
}
