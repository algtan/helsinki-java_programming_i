
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbersPass = new ArrayList<>();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        int sum = 0;
        int sumPass = 0;
        
        int countGrade0 = 0;
        int countGrade1 = 0;
        int countGrade2 = 0;
        int countGrade3 = 0;
        int countGrade4 = 0;
        int countGrade5 = 0;
        
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            } else if (number > 0 && number <= 100) {
                numbers.add(number);
                sum = sum + number;
                
                if (number >= 50) {
                    numbersPass.add(number);
                    sumPass = sumPass + number;
                    
                    if (number < 60) {
                        countGrade1 += 1;
                    } else if (number < 70) {
                        countGrade2 += 1;
                    } else if (number < 80) {
                        countGrade3 += 1;
                    } else if (number < 90) {
                        countGrade4 += 1;
                    } else {
                        countGrade5 += 1;
                    }
                    
                } else {
                    countGrade0 += 1;
                }
            }
            
        }
        
        double avg = 1.0 * sum / numbers.size();
        System.out.println("Point average (all): " + avg);
        
        if (numbersPass.size() < 1) {
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        } else {
            double avgPass = 1.0 * sumPass / numbersPass.size();
            double passPct = 100.0 * numbersPass.size() / numbers.size();
            System.out.println("Point average (passing): " + avgPass);
            System.out.println("Pass percentage: " + passPct);
        }
        
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        for (int i = 0; i < countGrade5; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("4: ");
        for (int i = 0; i < countGrade4; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("3: ");
        for (int i = 0; i < countGrade3; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("2: ");
        for (int i = 0; i < countGrade2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("1: ");
        for (int i = 0; i < countGrade1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("0: ");
        for (int i = 0; i < countGrade0; i++) {
            System.out.print("*");
        }
        
    }
}
