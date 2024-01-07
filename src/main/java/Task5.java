/*
Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.
 */

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";

        // Check if the lengths are equal
        if (word1.length() == word2.length()) {

            // Convert strings to char arrays for sorting
            char[] word1Chars = word1.toCharArray();
            char[] word2Chars = word2.toCharArray();

            // Sort the char arrays
            Arrays.sort(word1Chars);
            Arrays.sort(word2Chars);

            // Compare the sorted arrays
            if (!Arrays.equals(word1Chars, word2Chars)) {
                System.out.println("Not an anagram");
            } else {
                System.out.println("Anagram");
            }
        } else {
            System.out.println("Not an anagram");
        }
    }
}
