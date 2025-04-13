package Java_Coursework;
import java.util.Base64; // Import Base64 for encoding/decoding

public class FirmVacationPP4 {
    public static void main(String[] args) {
        // Using the Encryptable interface reference
        Encryptable e;

        // Secret uses Shift Cipher (shift each character by 5)
        e = new Secret();
        String secretText = "password";
        String encryptedSecret = e.encrypt(secretText);
        System.out.println("Original (Secret): " + secretText);
        System.out.println("Encrypted (Secret): " + encryptedSecret);
        System.out.println("Decrypted (Secret): " + e.decrypt(encryptedSecret));

        // Password uses Base64 encoding
        e = new Password();
        String passwordText = "password";
        String encryptedPassword = e.encrypt(passwordText);
        System.out.println("\nOriginal (Password): " + passwordText);
        System.out.println("Encrypted (Password): " + encryptedPassword);
        System.out.println("Decrypted (Password): " + e.decrypt(encryptedPassword));
    }

    // Encryptable Interface
    public interface Encryptable {
        String encrypt(String text);
        String decrypt(String text);
    }

    // Secret Class (Shift Cipher: shift by 5)
    public static class Secret implements Encryptable {
        private static final int SHIFT_AMOUNT = 5; // Shift by 5 for encryption

        public String encrypt(String text) {
            StringBuilder result = new StringBuilder();
            // Shift each character by +5
            for (char c : text.toCharArray()) {
                result.append((char)(c + SHIFT_AMOUNT));
            }
            return result.toString();
        }

        public String decrypt(String text) {
            StringBuilder result = new StringBuilder();
            // Shift back by -5
            for (char c : text.toCharArray()) {
                result.append((char)(c - SHIFT_AMOUNT));
            }
            return result.toString();
        }
    }
    
    // Password Class (Base64 Encoding)
    public static class Password implements Encryptable {
        public String encrypt(String text) {
            // Encode text in Base64
            return Base64.getEncoder().encodeToString(text.getBytes());
        }

        public String decrypt(String text) {
            // Decode text from Base64
            byte[] decodedBytes = Base64.getDecoder().decode(text);
            return new String(decodedBytes);
        }
    }
}
