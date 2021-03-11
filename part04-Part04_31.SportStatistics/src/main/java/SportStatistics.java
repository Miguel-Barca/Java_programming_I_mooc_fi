
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String file = scanner.nextLine();
        ArrayList<Game> games = readFromFile(file);
        
        System.out.println("Team:");
        String searchInput = scanner.nextLine();
        int counter = 0;
        int wins = 0;
        int losses = 0;
        
        for(Game game : games) {
            if(searchInput.equals(game.getTeam1()) || searchInput.equals(game.getTeam2())) {
                counter++;
                
                if(searchInput.equals(game.getTeam1())) {
                    if(game.getPoints1() > game.getPoints2()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                
                if(searchInput.equals(game.getTeam2())) {
                    if(game.getPoints2() > game.getPoints1()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            } 
        }
        
        System.out.println("Games: " + counter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    
    public static ArrayList<Game> readFromFile(String fileName) {
        ArrayList<Game> games = new ArrayList<>();
        
        //read file
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            
            while(fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String[] parts = row.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int score1 = Integer.valueOf(parts[2]);
                int score2 = Integer.valueOf(parts[3]);
                
                games.add(new Game(team1, team2, score1, score2));
            }
            
        } catch (IOException ex) { 
            Logger.getLogger(SportStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return games;
    }
}
