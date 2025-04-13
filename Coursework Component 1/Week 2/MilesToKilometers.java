package Java_Coursework;
import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in miles: ");
        double miles = scanner.nextDouble();
        
        double kilometers = miles * 1.60935;
        System.out.println("The distance in kilometers is: " + kilometers + " km");
    }
}
