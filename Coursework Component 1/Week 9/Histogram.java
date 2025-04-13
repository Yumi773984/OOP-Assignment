package Java_Coursework;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] ranges = new int[10];
		System.out.println("Enter numbers between 1 and 100(enter 0 to stop continuing:");
		 
		while(true) {
			int num = scanner.nextInt();
			
			if(num == 0) {
				break;
			}
			
			if (num >= 1 && num <= 100) {
				int index = (num - 1)/10; 
				ranges[index]++; 
			}
			
			else {
				System.out.println("Invalid input!! Enter numbers between 1 and 100(enter 0 to stop)");
			}
			}
			
			System.out.println("Output:");
			for(int i=0; i<ranges.length; i++) {
				int lower = i*10 +1;
				int upper = (i+1)*10;
				System.out.printf("%2d - %3d | ", lower, upper);
				
				for(int j = 0; j< ranges[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
}
