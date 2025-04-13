package Java_Coursework;
import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a sentence
        System.out.print("Enter a sentence that you want to reverse: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");
        String result = "";

        // Reverse each word
        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            result += reversedWord + " ";
        }

        // Print the result
        System.out.println("The reversed sentence is: " + result.trim());

        scanner.close();
    }
}

