package Java_Coursework;
import java.util.Scanner;

public class SquareCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of a square’s side: ");
        int side = scanner.nextInt();

        int perimeter = 4 * side;
        int area = side * side;

        System.out.println("The perimeter of the square is: " + perimeter);
        System.out.println("The area of the square is: " + area);
    }
}
