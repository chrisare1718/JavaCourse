import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare variables
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        // Get choices from user
        System.out.println("Enter you move (rock, paper, scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
            System.out.println("Invalid choice");
        }

        // Get random choice from the computer
        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: " + computerChoice);

        // Check win conditions


        // Ask to play again?
        // Goodbye message

        scanner.close();
    }

}
