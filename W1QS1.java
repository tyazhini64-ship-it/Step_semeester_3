import java.util.Random;

public class W1QS1 {

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        
        // Demo inputs for player moves
        String[] playerChoices = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        
        int rounds = 5;
        int wins = 0, losses = 0, draws = 0;
        
        System.out.printf("%-8s | %-12s | %-13s | %-13s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < rounds; i++) {
            String playerMove = playerChoices[i];
            String computerMove = moves[random.nextInt(3)];
            String result = playRound(playerMove, computerMove);

            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;

            System.out.printf("Round %-2d | %-12s | %-13s | %-13s%n", (i + 1), playerMove, computerMove, result);
        }

        double winPercentage = ((double) wins / rounds) * 100;
        System.out.println("---------------------------------------------------------");
        System.out.printf("Final Summary: Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", 
                wins, losses, draws, winPercentage);
    }
}