package Java_Coursework;
import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {
    public static void main(String[] args) {
    	double currentSalary;  // employee's current  salary
        double raise=0;          // amount of the raise
        double newSalary;      // new salary for the employee
        String rating;         // performance rating

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current salary: ");
        currentSalary = scanner.nextDouble();

        System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scanner.next();

        if (rating.equalsIgnoreCase("Excellent")) {
            raise = currentSalary * 0.06;
        } else if (rating.equalsIgnoreCase("Good")) {
            raise = currentSalary * 0.04;
        } else if (rating.equalsIgnoreCase("Poor")) {
            raise = currentSalary * 0.015;
        } else {
            System.out.println("Invalid rating. No raise applied.");
        }

        newSalary = currentSalary + raise;

        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary:       " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary:      " + money.format(newSalary));
        System.out.println();

    }
}

