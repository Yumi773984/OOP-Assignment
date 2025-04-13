package Java_Coursework;
import java.util.Scanner;
import java.util.Random;

public class PinEncription {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Random rand = new Random();

      System.out.print("Enter a 4 digit pin to encrypt: ");
      int pin = scan.nextInt();

      String hexPin = Integer.toHexString(pin);

      int rand1 = 1000 + rand.nextInt(64536); // 1000 to 65535
      int rand2 = 1000 + rand.nextInt(64536);

      String hex1 = Integer.toHexString(rand1);
      String hex2 = Integer.toHexString(rand2);

      String encrypted = hex1 + hexPin + hex2;

      System.out.println("Your encrypted pin number is " + encrypted + ".");
   }
}
