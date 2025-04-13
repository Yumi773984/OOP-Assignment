package Java_Coursework;
import java.util.Scanner;

public class ComputingAverages {

	public static void main(String[] args) {
		int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in);

        // Get three values from user
        System.out.println("Please enter three integers" + " I will compute their average");

        System.out.print("Enter the first value: ");
        val1 = scan.nextInt();
        
        System.out.print("Enter the second value: ");
        val2 = scan.nextInt();
        
        System.out.print("Enter the third value: ");
        val3 = scan.nextInt();

        // Compute the average
        average = (val1 + val2 + val3) / 3.0;

        // Print the average
        System.out.println("The average is of the given numbers is: " + average);
	}

}
