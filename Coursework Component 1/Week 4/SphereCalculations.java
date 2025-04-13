package Java_Coursework;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SphereCalculations {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      DecimalFormat fmt = new DecimalFormat("0.000");

      System.out.print("Enter the radius of the sphere: ");
      double radius = scan.nextDouble();

      double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
      double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

      System.out.println("Volume of the sphere is: " + fmt.format(volume));
      System.out.println("Surface Area of the sphere is: " + fmt.format(surfaceArea));
   }
}

