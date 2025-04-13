package Java_Coursework;
import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter a denominator: ");
        int denominator = scanner.nextInt();

        if (denominator != 0) {
            System.out.println("Decimal equivalent is: " + (double) numerator / denominator);
        } else {
            System.out.println("Error: Cannot divide by zero. Try again..");
        }
    }
}
