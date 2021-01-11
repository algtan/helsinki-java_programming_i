
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user for points
        System.out.println("Give points [0-100]:");
        
        // Store the points as an integer
        int score = Integer.valueOf(scan.nextLine());
        
        // Conditions for score
        if (score < 0) {
            System.out.println("impossible!");
        } else if (score >= 0 && score <= 49) {
            System.out.println("failed");
        } else if (score >= 50 && score <= 59) {
            System.out.println("1");
        } else if (score >= 60 && score <= 69) {
            System.out.println("2");
        } else if (score >= 70 && score <= 79) {
            System.out.println("3");
        } else if (score >= 80 && score <= 89) {
            System.out.println("4");
        } else if (score >= 90 && score <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }
    }
}
