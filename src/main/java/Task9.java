/*
Find the First Non-Repeating Character in a String: Given a string, find and
return the first non-repeating character. For example, in the string
"abracadabra", the first non-repeating character is 'c'.
 */

public class Task9 {
    public static void main(String[] args) {

        String input = "abracadabra";
        char firstNonRepeatingChar = findFirstNonRepeatingChar(input);

        System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
    }

    private static char findFirstNonRepeatingChar(String input) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (char ch : input.toCharArray()) {
            charCount[ch]++;
        }

        // Find the first non-repeating character
        for (char ch : input.toCharArray()) {
            if (charCount[ch] == 1) {
                return ch;
            }
        }

        // If no non-repeating character is found
        return '\0'; // You can return a special character or handle it as needed
    }
}
