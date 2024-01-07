/*
Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward. For
example, "madam" is a palindrome.
 */

public class Task4 {
    public static void main(String[] args) {

        String wd = "madam";
        String reverseword = "";
        for (int i = wd.length()-1; i >= 0; i--) {
            reverseword = reverseword + wd.charAt(i);
        }
        reverseword = reverseword.replaceAll("\\s", "").toLowerCase();

        if (wd.equals(reverseword)){
            System.out.println("It's palindrome");
        }else {
            System.out.println("It's not palindrome");
        }
    }
}
