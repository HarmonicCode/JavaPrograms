import java.util.InputMismatchException;
import java.util.Scanner;

public class FootballMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for team 1
        System.out.print("Enter the name of team 1: ");
        String team1 = scanner.nextLine();

        int score1 = getValidScore(scanner, "Enter the score of team 1: ");

        // Consume the leftover newline after score1
        scanner.nextLine();

        // Input for team 2
        System.out.print("Enter the name of team 2: ");
        String team2 = scanner.nextLine();

        int score2 = getValidScore(scanner, "Enter the score of team 2: ");
        
        // Check and print the result
        if (score1 > score2) {
            System.out.println(team1 + " wins");
        } else if (score2 > score1) {
            System.out.println(team2 + " wins");
        } else {
            System.out.println("Match drawn");
        }

        // Close scanner
        scanner.close();
    }

    // Method to handle invalid score inputs
    public static int getValidScore(Scanner scanner, String prompt) {
        int score = -1;
        while (true) {
            try {
                System.out.print(prompt);
                score = scanner.nextInt();
                break; // Exit loop when a valid score is entered
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer score.");
                scanner.next(); // Clear invalid input
            }
        }
        return score;
    }
}
