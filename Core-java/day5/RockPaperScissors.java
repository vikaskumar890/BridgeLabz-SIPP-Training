import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {
        double rand = Math.random();
        if (rand < 1.0/3) return "rock";
        else if (rand < 2.0/3) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if (user.equals("rock")) {
            if (computer.equals("scissors")) return "User";
            else return "Computer";
        }
        if (user.equals("paper")) {
            if (computer.equals("rock")) return "User";
            else return "Computer";
        }
        if (user.equals("scissors")) {
            if (computer.equals("paper")) return "User";
            else return "Computer";
        }
        return "Invalid";
    }

    public static String[][] stats(int userWins, int compWins, int draws, int total) {
        double userPercent = total > 0 ? ((double)userWins/total)*100 : 0;
        double compPercent = total > 0 ? ((double)compWins/total)*100 : 0;
        double drawPercent = total > 0 ? ((double)draws/total)*100 : 0;

        String[][] table = {
            {"Player Wins", String.valueOf(userWins), String.format("%.2f%%", userPercent)},
            {"Computer Wins", String.valueOf(compWins), String.format("%.2f%%", compPercent)},
            {"Draws", String.valueOf(draws), String.format("%.2f%%", drawPercent)},
            {"Total Games", String.valueOf(total), "100%"}
        };
        return table;
    }

    public static void displayResults(String[] userChoices, String[] compChoices, String[] winners, int userWins, int compWins, int draws) {
        System.out.printf("%-10s %-12s %-12s %-10s\n", "Game#", "User Choice", "Computer", "Winner");
        for (int i = 0; i < userChoices.length; i++) {
            System.out.printf("%-10d %-12s %-12s %-10s\n", i+1, userChoices[i], compChoices[i], winners[i]);
        }
        System.out.println();
        String[][] statTable = stats(userWins, compWins, draws, userChoices.length);
        System.out.printf("%-15s %-10s %-10s\n", "Category", "Count", "Percentage");
        for (String[] row : statTable) {
            System.out.printf("%-15s %-10s %-10s\n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] userChoices = new String[n];
        String[] compChoices = new String[n];
        String[] winners = new String[n];
        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter choice for game " + (i+1) + " (rock/paper/scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            String compChoice = computerChoice();

            String winner = findWinner(userChoice, compChoice);

            userChoices[i] = userChoice;
            compChoices[i] = compChoice;
            winners[i] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else if (winner.equals("Draw")) draws++;
        }

        displayResults(userChoices, compChoices, winners, userWins, compWins, draws);

        scanner.close();
    }
}
