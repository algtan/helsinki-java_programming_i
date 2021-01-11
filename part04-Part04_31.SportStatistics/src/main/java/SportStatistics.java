
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String input = scan.nextLine();
        
        ArrayList<String> lines = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(Paths.get(input))) {

            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                lines.add(scanner.nextLine());
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int count = 0;
        int wins = 0;
        int losses = 0;
        
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] parts = line.split(",");
            String home = parts[0];
            String away = parts[1];
            int homeScore = Integer.valueOf(parts[2]);
            int awayScore = Integer.valueOf(parts[3]);
            
            if (team.equals(home)) {
                count = count + 1;
                if (homeScore > awayScore) {
                    wins = wins + 1;
                } else {
                    losses = losses + 1;
                }
            }
            
            if (team.equals(away)) {
                count = count + 1;
                if (awayScore > homeScore) {
                    wins = wins + 1;
                } else {
                    losses = losses + 1;
                }
            }
        }
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
