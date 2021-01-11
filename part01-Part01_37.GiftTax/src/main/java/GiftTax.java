
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user for value of gift
        System.out.println("Value of the gift?");
        // Store the value as an integer
        int gift = Integer.valueOf(scan.nextLine());
        
        // Create integer tax to store amount of tax
        double tax;
        
        // Check how much tax is paid
        if (gift >= 5000 && gift < 25000) {
            tax = (gift - 5000) * 0.08 + 100;
        } else if (gift >= 25000 && gift < 55000) {
            tax = (gift - 25000) * 0.10 + 1700;
        } else if (gift >= 55000 && gift < 200000) {
            tax = (gift - 55000) * 0.12 + 4700;
        } else if (gift >= 200000 && gift < 1000000) {
            tax = (gift - 200000) * 0.15 + 22100;
        } else if (gift >= 1000000) {
            tax = (gift - 1000000) * 0.17 + 142100;
        } else {
            tax = 0;
        }
        
        if (tax > 0) {
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
