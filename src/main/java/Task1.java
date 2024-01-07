/*
Write a program to swap 2 String without a temporary variable?
 */
public class Task1 {
    public static void main(String[] args) {

        String x = "Java";
        String y = "Language";

        System.out.println("Before swapping happen:");
        System.out.println("String x: "+x);
        System.out.println("String y: "+y);

        // Swap without a temporary variable
        x = x+y;
        y = x.substring(0, x.length() - y.length());
        x = x.substring(y.length());

        System.out.println("After swapping");
        System.out.println("String 1: "+x);
        System.out.println("String 2: "+y);
    }
}
