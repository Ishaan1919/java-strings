import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int numGames = input.nextInt();
        input.nextLine(); 
        
        String[][] gameResults = new String[numGames][3];
        int userWins = 0, computerWins = 0;
        
        for (int i = 0; i < numGames; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = input.nextLine();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);
            
            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;
            
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }
        
        String[][] stats = calculateStats(userWins, computerWins, numGames);
        displayResults(gameResults, stats);
        
        input.close();
    }
    
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }
    
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equals("Scissors") && computerChoice.equals("Paper")) ||
            (userChoice.equals("Paper") && computerChoice.equals("Rock"))) {
            return "User";
        }
        return "Computer";
    }
    
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[1][3];
        
        stats[0][0] = "User: " + userWins + " wins";
        stats[0][1] = "Computer: " + computerWins + " wins";
        stats[0][2] = "User Win %: " + (userWins * 100.0 / totalGames) + "% | Computer Win %: " + (computerWins * 100.0 / totalGames) + "%";
        
        return stats;
    }
    
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("Game | User Choice | Computer Choice | Winner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%4d | %11s | %15s | %6s\n", (i + 1), gameResults[i][0], gameResults[i][1], gameResults[i][2]);
        }
        System.out.println("\nOverall Stats:");
        System.out.println(stats[0][0] + " | " + stats[0][1]);
        System.out.println(stats[0][2]);
    }
    
}
