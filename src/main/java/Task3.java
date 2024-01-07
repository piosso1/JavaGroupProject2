/*
Reverse a String: Write a function to reverse a given string. For example,
given the input "Hello", the output should be "olleH".
 */

public class Task3 {
    public static void main(String[] args) {

        String re = "Hello";
        for (int i = re.length()-1; i >= 0;  i--) {
            System.out.print(re.charAt(i));
        }

    }
}
