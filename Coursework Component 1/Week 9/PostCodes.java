package Java_Coursework;
import java.util.Scanner;
	
class Person {
	String firstName;
	String lastName;
	String postalCode;
		
	public Person(String firstName, String lastName, String postalCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.postalCode = postalCode;
	}
		
	public void displayDetails() {
		System.out.printf("Name: %s %s | Postal Code: %s\n", firstName, lastName, postalCode); // Prints the person's full name and postal code in a formatted way, %s is a placeholder for a String; \n adds a new line after printing
	}
}

public class PostCodes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person[] people = new Person[25]; // max 25 entries
		int count = 0;

		System.out.println("Please enter up to 25 records (use space to separate First Name, Last Name, and Postal Code).");
		System.out.println("Type 'stop' to finish the input.");

		while (count < 25) {
			System.out.print("Enter record #" + (count + 1) + ": ");
			String line = scanner.nextLine();

			if (line.equalsIgnoreCase("stop")) {
				break; // stop reading input
			}

			String[] parts = line.split(" ");
			
			if (parts.length != 3) {
				System.out.println("Invalid input. Please enter exactly three values separated by tabs.\n");
				continue;
			}

			String first = parts[0];
			String last = parts[1];
			String code = parts[2];

			people[count] = new Person(first, last, code); // create and store the object
			count++;
		}

		// Display all entered records
		System.out.println("\n------ All Postal Records ------");
		for (int i = 0; i < count; i++) {
			people[i].displayDetails(); 
		}

		scanner.close();
	}
}
