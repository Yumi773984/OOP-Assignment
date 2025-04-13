package Java_Coursework;

public class PunctuationMarks {
    public static void main(String[] args) {
        // The given text (counting punctuation in this)
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end. ";

        // Variables to count punctuation marks
        int commaCount = 0, periodCount = 0, dashCount = 0;

        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // Get the current character

            // Check if it's a punctuation mark and update the count
            if (ch == ',') {
                commaCount++;
            } else if (ch == '.') {
                periodCount++;
            } else if (ch == '-') {
                dashCount++;
            }
        }

        // Printing a proper table with clear labels
        System.out.println("+-------------------------+--------+");
        System.out.println("| Punctuation Type        | Count  |");
        System.out.println("+-------------------------+--------+");
        System.out.printf("| Number of commas  (,)   |   %d    |\n", commaCount);
        System.out.printf("| Number of periods (.)   |   %d    |\n", periodCount);
        System.out.printf("| Number of dashes  (-)   |   %d    |\n", dashCount);
        System.out.println("+-------------------------+--------+");
    }
}
