package Java_Coursework;
import java.util.Random;

public class CardGame {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King"};
        
        Random random = new Random();
        
        System.out.println("Your 5 random cards:");
        
        for (int i = 0; i < 5; i++) {
            String suit = suits[random.nextInt(suits.length)];
            String value = values[random.nextInt(values.length)];
            System.out.println((i+1) + ". " + value + " of " + suit);
        }
    }
}