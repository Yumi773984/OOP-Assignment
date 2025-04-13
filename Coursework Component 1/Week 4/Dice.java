package Java_Coursework;
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random rand = new Random();

        int sides1 = 6;
        int sides2 = 20;
        
        System.out.println("How many sides does dice 1 have? " + sides1 );
        System.out.println("How many sides does dice 2 have? " + sides2 );

        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i <= 3; i++) {
            int roll1 = rand.nextInt(sides1) + 1;
            int roll2 = rand.nextInt(sides2) + 1;

            System.out.println("Dice 1 roll " + i + " = " + roll1 + ".");
            System.out.println("Dice 2 roll " + i + " = " + roll2 + ".");

            total1 += roll1;
            total2 += roll2;
        }

        System.out.println("Dice 1 rolled a total of " + total1 + " and rolled " + (total1 / 3.0) + " on average.");
        System.out.println("Dice 2 rolled a total of " + total2 + " and rolled " + (total2 / 3.0) + " on average.");
    }
}
