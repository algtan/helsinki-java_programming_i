
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("First Name: ");
            String first = scanner.nextLine();
            if (first.isEmpty()) {
                break;
            }
            
            System.out.print("Last Name: ");
            String last = scanner.nextLine();
            
            System.out.print("Identificaiton number:");
            String id = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(first,last,id));
        }
        
        System.out.println("");
        
        for (PersonalInformation info: infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
