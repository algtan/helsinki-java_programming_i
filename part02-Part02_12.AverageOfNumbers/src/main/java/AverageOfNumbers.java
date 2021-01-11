
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                if (count == 0) {
                    count = 1;
                }
                break;
            }
            
            count = count + 1;
            sum = sum + num;
        }
        
        double avg = (double) sum / count;
        
        System.out.println("Average of the numbers: " + avg);

    }
}
