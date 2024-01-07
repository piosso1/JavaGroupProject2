/*
Create a method to count how many vowels are present in a string
“documentation”
 */

public class Task6 {
    public static void main(String[] args) {

        int vCount = 0;

        String doc = "documentation";

        doc = doc.toLowerCase();
        for (int i = 0; i < doc.length(); i++) {
            if (doc.charAt(i)=='a' || doc.charAt(i)=='e' || doc.charAt(i)=='i' || doc.charAt(i)=='o' || doc.charAt(i)=='u');
            vCount++;
        }
        System.out.println(vCount);
    }
}
