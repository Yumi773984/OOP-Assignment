package Java_Coursework;
import java.util.Scanner;
import java.util.Random;

public class Rock {
    public static void main(String[] args) {
        String personPlay, computerPlay = "";
        int computerInt; // Randomly generated number used to determine computer's play

        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        // Get player's play -- note that this is stored as a string
        System.out.print("Enter your play (R, P, S): ");
        personPlay = scanner.next().toUpperCase(); // Convert to uppercase for easy comparison

        // Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);

        // Translate computer's randomly generated play to string
        switch (computerInt) {
            case 0 -> computerPlay = "R";
            case 1 -> computerPlay = "P";
            case 2 -> computerPlay = "S";
        }

        // Print computer's play
        System.out.println("Computer played: " + computerPlay);

        // See who won. Use nested ifs instead of &&
        if (personPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
        } else if (personPlay.equals("R")) {
            if (computerPlay.equals("S")) {
                System.out.println("Rock crushes Scissors. You win!");
            } else {
                System.out.println("Paper covers Rock. Computer wins!");
            }
        } else if (personPlay.equals("P")) {
            if (computerPlay.equals("R")) {
                System.out.println("Paper covers Rock. You win!");
            } else {
                System.out.println("Scissors cut Paper. Computer wins!");
            }
        } else if (personPlay.equals("S")) {
            if (computerPlay.equals("P")) {
                System.out.println("Scissors cut Paper. You win!");
            } else {
                System.out.println("Rock crushes Scissors. Computer wins!");
            }
        } else {
            System.out.println("Invalid input! Please enter R, P, or S.");
        }
    }
}
