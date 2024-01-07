/*
Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2
 */

public class Task7 {
    public static void main(String[] args) {

        String wd = "Hello, world";
        String [] wdArr = wd.split(",");
        System.out.println(wdArr.length);
    }
}
