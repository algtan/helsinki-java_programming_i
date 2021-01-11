
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            } else if (num < 0) {
                continue;
            } else {
                count = count + 1;
                sum = sum + num;
            }
        }
        
        if (count == 0 ) {
            System.out.println("Cannot calculate the average");
        } else {
            double avg = (double) sum / count;
            System.out.println(avg);
        }
    }
}
