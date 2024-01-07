/*
Find out how many alpha characters are present in a string?
"I love learning java"
 */
public class Task2 {
    public static void main(String[] args) {

        String s1 = "I love learning java";

        int al = 0;
        for (int i = 0; i < s1.length()-1; i++) {
            char c = s1.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c > 'A' && c <= 'Z'))
                al++;
        }
        System.out.println(al);
    }
}